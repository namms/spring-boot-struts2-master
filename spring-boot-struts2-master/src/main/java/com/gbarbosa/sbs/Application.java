package com.gbarbosa.sbs;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.apache.struts2.tiles.StrutsTilesListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import java.util.EventListener;

@SpringBootApplication
@ServletComponentScan
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
    }
    @Bean
    public FilterRegistrationBean<Filter> filterRegistrationBean() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<Filter>();
        registration.setFilter(new StrutsPrepareAndExecuteFilter());
        registration.setName("struts");
        registration.addUrlPatterns("/*");
        registration.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
        registration.setName("StrutsPrepareAndExecuteFilter");
        registration.setOrder(3);
        return registration;
    }

    @Bean
    public ServletListenerRegistrationBean<EventListener> strutsTilesListenerBean() {
        ServletListenerRegistrationBean<EventListener> registrationBean = new ServletListenerRegistrationBean<EventListener>();
        StrutsTilesListener strutsTilesListener = new StrutsTilesListener();
        registrationBean.setListener(strutsTilesListener);
        return registrationBean;
    }
}
