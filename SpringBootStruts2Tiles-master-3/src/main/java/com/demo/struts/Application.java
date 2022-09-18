package com.demo.struts;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.apache.struts2.tiles.StrutsTilesListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.ServletContext;
import java.util.EventListener;

@SpringBootApplication(exclude = { FreeMarkerAutoConfiguration.class, RedisAutoConfiguration.class})
public class Application extends SpringBootServletInitializer {
	private static final Logger log = LoggerFactory.getLogger(Application.class);


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("Started application at {}", "http://localhost:8080");
	}

	@Bean
	public FilterRegistrationBean<Filter> filterRegistrationBean() {
		FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
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
		ServletListenerRegistrationBean<EventListener> registrationBean = new ServletListenerRegistrationBean<>();
		StrutsTilesListener strutsTilesListener = new StrutsTilesListener();
		registrationBean.setListener(strutsTilesListener);
		return registrationBean;
	}



	@Bean
	public UrlBasedViewResolver viewResolver() {
		UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
		tilesViewResolver.setViewClass(TilesView.class);
		return tilesViewResolver;
	}

	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tiles = new TilesConfigurer();
		tiles.setDefinitions(new String[] { "/WEB-INF/tiles/tiles.xml" });
		return tiles;

	}
}