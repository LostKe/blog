package com.zs.blog.core.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.InputStream;

/**
 * Created by zhangshuqing on 2017/2/16.
 */
public class BaseAction extends ActionSupport {

    protected InputStream inputStream;

    public InputStream getInputStream(){
        return inputStream;
    }
}
