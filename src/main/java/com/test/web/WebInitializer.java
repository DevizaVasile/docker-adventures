package com.test.web;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work
 */
@Configuration
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("boot method1");
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("boot method2");
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("boot method3");
        return new String[]{"/"};
    }
    
}
