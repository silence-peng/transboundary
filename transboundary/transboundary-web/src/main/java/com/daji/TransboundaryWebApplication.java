package com.daji;

import com.daji.util.CrosFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartResolver;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.daji.mapper")
public class TransboundaryWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransboundaryWebApplication.class, args);
    }
    @Bean
    public FilterRegistrationBean registerFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.addUrlPatterns("/*");
        bean.setFilter(new CrosFilter());
        return bean;
    }
}
