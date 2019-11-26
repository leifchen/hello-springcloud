package com.chen.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * ErrorFilter
 * <p>
 * @Author LeifChen
 * @Date 2019/11/21
 */
public class ErrorFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "error";
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
        System.out.println("Inside Error Filter");
        return null;
    }
}