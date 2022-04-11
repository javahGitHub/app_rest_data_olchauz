package pdp.uz.app_rest_data_olchauz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import pdp.uz.app_rest_data_olchauz.entity.Attachment;
import pdp.uz.app_rest_data_olchauz.entity.AttachmentContent;
import pdp.uz.app_rest_data_olchauz.repository.AttachmentContentRepository;
import pdp.uz.app_rest_data_olchauz.repository.AttachmentRepository;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("attachment")
public class AttachmentController {
    public static final String directory = "uploads/";
    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    /*
     * File DB upload and download actions
     *
     * */


    //upload to DB
    @PostMapping("/upload")
    public String uploadFileByDB(MultipartHttpServletRequest request) throws IOException {
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());
        if (file != null) {
            //GET FILE INFORMATION
            String originalFilename = file.getOriginalFilename();
            String contentType = file.getContentType();
            long size = file.getSize();
            Attachment attachment = new Attachment();
            attachment.setContentType(contentType);
            attachment.setOriginalFileName(originalFilename);
            attachment.setSize(size);
            Attachment savedAttachment = attachmentRepository.save(attachment);

            //GET FILE BYTES
            AttachmentContent attachmentContent = new AttachmentContent();
            attachmentContent.setMainBytes(file.getBytes());
            attachmentContent.setAttachment(savedAttachment);
            attachmentContentRepository.save(attachmentContent);
            return "File uploaded successfully by id=" + savedAttachment.getId();
        } else return "Error to  get file info ";
    }

    //Get all info//Get all info from DB
    @GetMapping("/info")
    public List getInfo(){
        List<Attachment> attachmentList = attachmentRepository.findAll();
        return attachmentList;
    }

    //Get one info from DB
    @GetMapping("/info/{id}")
    public Attachment getInfoById(@PathVariable Integer id){
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if(!optionalAttachment.isPresent())
            return new Attachment();
        return optionalAttachment.get();
    }

    //download by id from DB
    @GetMapping("/download/{id}")
    public void downloadFile(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (optionalAttachment.isPresent()) {
            Attachment attachment = optionalAttachment.get();
            Optional<AttachmentContent> optionalAttachmentContent = attachmentContentRepository.findByAttachmentId(id);
            if (optionalAttachmentContent.isPresent()) {
                AttachmentContent attachmentContent = optionalAttachmentContent.get();
                response.setHeader("Content-Disposition", "attachment;filename=\"" + attachment.getOriginalFileName() + "\"");
                response.setContentType(attachment.getContentType());

                FileCopyUtils.copy(attachmentContent.getMainBytes(), response.getOutputStream());

            }
        }

    }



}
