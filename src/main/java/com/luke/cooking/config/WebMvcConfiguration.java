package com.luke.cooking.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.luke.cooking")
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /*@Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources**").addResourceLocations("/resources/");
    }*/

    @Bean
    public InternalResourceViewResolver htmlViewResolver() {
        InternalResourceViewResolver htmlViewResolver = new InternalResourceViewResolver();
        htmlViewResolver.setPrefix("/WEB-INF/static/");
        htmlViewResolver.setSuffix(".html");
        return htmlViewResolver;
    }
}
