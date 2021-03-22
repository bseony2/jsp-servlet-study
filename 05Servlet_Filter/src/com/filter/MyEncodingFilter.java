package com.filter;

import javax.servlet.*;
import javax.servlet.Filter;
import java.io.IOException;

public class MyEncodingFilter implements Filter{

    public void destroy(){
        System.out.println("MyEncodingFilter.destroy");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyEncodingFilter.doFilter요청");

        request.setCharacterEncoding("utf-8");
        chain.doFilter(request, response);

        System.out.println("MyEncodingFilter.doFilter응답");
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException{
        System.out.println("MyEncodingFilter.doFilter init");
    }
}
