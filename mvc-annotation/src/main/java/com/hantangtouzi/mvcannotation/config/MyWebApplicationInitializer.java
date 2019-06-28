package com.hantangtouzi.mvcannotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author WilliamChang.
 * Created on 2018/7/10 10:58
 */

@Configuration
public class MyWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //@Override
    //public void onStartup(javax.servlet.ServletContext servletContext) {
    //    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    //    context.register(RootConfig.class);
    //    context.refresh();
    //
    //    DispatcherServlet servlet = new DispatcherServlet(context);
    //    ServletRegistration.Dynamic registration = servletContext.addServlet("spring", servlet);
    //    registration.setLoadOnStartup(1);
    //    registration.addMapping("/");
    //}
}
