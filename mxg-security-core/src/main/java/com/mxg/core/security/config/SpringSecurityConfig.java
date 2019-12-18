package com.mxg.core.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author matao
 * @create 2019-12-09 17:55
 */
@Configuration
@EnableWebSecurity //开启SpringSecurity过滤器链filter
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 认证管理器：
     * 1、认证信息（用户名、密码）、
     *
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    /**
     * 资源权限配置：
     * 1、被拦截的资源配置
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic()  //采用httpBasic的认证方式
            .and()
            .authorizeRequests()  //认证请求
            .anyRequest().authenticated()   //所有访问该应用的http请求都要通过身份认证才可以访问
        ;
    }
}
