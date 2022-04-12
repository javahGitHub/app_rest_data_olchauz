package pdp.uz.app_rest_data_olchauz.config;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import pdp.uz.app_rest_data_olchauz.enums.RoleEnum;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("super_admin").password(passwordEncoder().encode("#super_admin")).roles(RoleEnum.SUPER_ADMIN.name()).authorities("READ_ALL","READ","DELETE","UPDATE","ADD")
                .and()
                .withUser("moderator").password(passwordEncoder().encode("#moderator")).roles(RoleEnum.MODERATOR.name()).authorities("READ_ALL","READ","UPDATE","ADD")
                .and()
                .withUser("operator").password(passwordEncoder().encode("#operator")).roles(RoleEnum.OPERATOR.name()).authorities("READ_ALL","READ")
        ;
    }



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                    .antMatchers(HttpMethod.DELETE,"/api/**").hasAuthority("DELETE")
                    .antMatchers(HttpMethod.POST,"/api/**").hasAuthority("ADD")
                    .antMatchers(HttpMethod.PUT,"/api/**").hasAuthority("UPDATE")
                    .antMatchers(HttpMethod.GET,"/api/**").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Bean
     PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
