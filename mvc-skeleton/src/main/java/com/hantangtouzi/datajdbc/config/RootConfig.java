package com.hantangtouzi.datajdbc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author WilliamChang.
 * @since 2018/7/10 0:43
 */

@Configuration
@Import(DataConfig.class)
@ComponentScan(basePackages = "com.hantangtouzi.datajdbc")
public class RootConfig {

}
