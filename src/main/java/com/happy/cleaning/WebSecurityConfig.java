package com.happy.cleaning;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("admin")
                .roles("ADMIN")
                .and()
                .withUser("manager")
                .password("manager")
                .roles("MANAGER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()

                .antMatchers( "/css/**", "/").permitAll()
                .antMatchers( "/js/**", "/").permitAll()
                .antMatchers( "/images/**", "/").permitAll()
                .antMatchers( "/scss/**", "/").permitAll()
                .antMatchers( "/fonts/flaticon/**", "/").permitAll()
                .antMatchers("/").permitAll()
                .antMatchers("/home").permitAll()
                .antMatchers("/about").permitAll()
                .antMatchers("/services-client").permitAll()
                .antMatchers("/service-details-client").permitAll()
                .antMatchers("/services-client/service/{id}").permitAll()
                .antMatchers("/contact").permitAll()
                .antMatchers("/**").hasRole("ADMIN")
                .and().formLogin()
                .and()
                .csrf().disable();
    }

    @Bean
    public PasswordEncoder encoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
