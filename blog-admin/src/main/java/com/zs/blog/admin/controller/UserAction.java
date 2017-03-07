package com.zs.blog.admin.controller;


import com.alibaba.fastjson.JSON;
import com.zs.blog.common.bean.BlogSystem;
import com.zs.blog.core.action.BaseAction;

import java.io.ByteArrayInputStream;
import java.util.Date;

/**
 * Created by zhangshuqing on 2017/2/16.
 */
public class UserAction extends BaseAction {

    /**
     * 测试主页
     * @return
     * @throws Exception
     */
    public String initHome() throws Exception {
        BlogSystem system = new BlogSystem();
        system.setName("blog");
        system.setDate(new Date());
        system.setDesc("this is my first blog");
        system.setAuthor("toms");
        inputStream = new ByteArrayInputStream(JSON.toJSONBytes(system));
        return SUCCESS;
    }
}
