package com.hantangtouzi.sample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author WilliamChang.
 * created on 2018/7/10 0:28
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.hantangtouzi.sample.web")
public class WebConfig implements WebMvcConfigurer {
    //@Bean
    //public ViewResolver viewResolver() {
    //    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    //    resolver.setPrefix("/WEB-INF/views/");
    //    resolver.setSuffix(".jsp");
    //    resolver.setExposeContextBeansAsAttributes(true);
    //    return resolver;
    //}
    //
    //@Override
    //public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    //    configurer.enable();
    //}
}

