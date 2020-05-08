package com.os;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableEurekaServer
public class OrderEurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderEurekaserverApplication.class, args);
    }

    /**
     * 新版的 Spring security 会默认开启防 csrf 攻击，所有的请求都必须携带
     * crsf 这个参数，但是从以上的信息来看显然是没有的。所以我们需要主动去关闭。
     */
    @EnableWebSecurity
    static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().ignoringAntMatchers("/eureka/**");
            super.configure(http);
        }
    }
}
