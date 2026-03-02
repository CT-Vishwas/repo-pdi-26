package com.cloudthat;

import com.cloudthat.config.AppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
