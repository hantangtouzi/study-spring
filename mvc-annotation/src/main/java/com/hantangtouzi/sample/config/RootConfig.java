package com.hantangtouzi.sample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author WilliamChang.
 * @since 2018/7/10 0:43
 */

@Configuration
@ComponentScan(basePackages = "com.hantangtouzi.sample", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {

}
