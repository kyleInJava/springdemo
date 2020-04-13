package com.kyle.demo.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class CrosInterceptor implements HandlerInterceptor {
 
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse response, Object o) throws Exception {
        System.out.println("添加跨域支持");
        //添加跨域CORS
        response.addHeader("Access-Control-Max-Age", "1800");//30 min
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Headers", "X-Requested-With,content-type,Content-Type,token");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");
        return true;
    }
 
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }
 
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion");
    }
}