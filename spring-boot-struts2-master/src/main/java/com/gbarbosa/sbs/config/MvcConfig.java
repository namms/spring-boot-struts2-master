//package com.gbarbosa.sbs.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
//import org.springframework.web.servlet.view.tiles3.TilesViewResolver;
//
//@EnableWebMvc
//@Configuration
//public class MvcConfig implements WebMvcConfigurer {
//
//    @Bean
//    public TilesConfigurer tilesConfigurer() {
//        TilesConfigurer tilesConfigurer = new TilesConfigurer();
//        tilesConfigurer.setDefinitions(
//                new String[] { "/WEB-INF/tiles.xml" });
//        tilesConfigurer.setCheckRefresh(true);
//
//        return tilesConfigurer;
//    }
//
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        TilesViewResolver viewResolver = new TilesViewResolver();
//        registry.viewResolver(viewResolver);
//    }
//
//
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**")
//                .addResourceLocations("/static/");
//    }
//}