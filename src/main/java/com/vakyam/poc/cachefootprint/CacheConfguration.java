package com.vakyam.poc.cachefootprint;

import org.springframework.cache.CacheManager;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfguration {

    @Bean
    public EhCacheCacheManager getCacheManager(){
        EhCacheCacheManager cm = new EhCacheCacheManager();
        return cm;
    }

//    @Bean
//    public EhCacheManagerFactoryBean getCacheManagerFactory(){
//        EhCacheManagerFactoryBean factory = new EhCacheManagerFactoryBean();
//        return factory;
//    }
}
