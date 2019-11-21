package com.chen.zuul.config;

import com.chen.zuul.filter.ErrorFilter;
import com.chen.zuul.filter.PostFilter;
import com.chen.zuul.filter.PreFilter;
import com.chen.zuul.filter.RouteFilter;
import org.springframework.context.annotation.Bean;

/**
 * Zuul网关配置
 * <p>
 * @Author LeifChen
 * @Date 2019-11-21
 */
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
