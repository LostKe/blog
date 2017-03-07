package com.zs.blog.core.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by zhangshuqing on 2017/2/17.
 */
public class EncodingFilter implements javax.servlet.Filter {
    private String encoding;
    public String getEncoding() {
        return encoding;
    }


    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }


    @Override
    public void destroy() {

    }


    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) request;
        if (request.getCharacterEncoding() == null) {
            String encoding = getEncoding();
            if (encoding != null) {
                request.setCharacterEncoding(encoding);
            }
        }
        response.setContentType("text/html;charset=" + encoding);
        response.setCharacterEncoding(encoding);
        chain.doFilter(request, response);

    }


    @Override
    public void init(FilterConfig filterconfig) throws ServletException {
        this.encoding = filterconfig.getInitParameter("encoding");
    }
}
