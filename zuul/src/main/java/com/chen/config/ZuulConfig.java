package com.chen.config;

import com.chen.filter.ErrorFilter;
import com.chen.filter.PostFilter;
import com.chen.filter.PreFilter;
import com.chen.filter.RouteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Zuul网关配置
 * <p>
 * @Author LeifChen
 * @Date 2019-11-21
 */
@Configuration
public class ZuulConfig {

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
