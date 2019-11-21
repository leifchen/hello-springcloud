package com.chen.zuul.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * PostFilter
 * <p>
 * @Author LeifChen
 * @Date 2019/11/21
 */
public class PostFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("Inside Response Filter");
        return null;
    }
}