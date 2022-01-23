package com.projects.coupons.security.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringBootSecurityConfiguration extends WebSecurityConfigurerAdapter {
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("admin").password("password").roles("USER");
//    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("api/v1/customers/**").hasRole(ApplicationUserRoles.CUSTOMER.name())
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();

        http.csrf().disable();
    }
}
