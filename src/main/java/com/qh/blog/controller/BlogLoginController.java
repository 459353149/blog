package com.qh.blog.controller;

import com.qh.blog.vo.BaseResult;
import com.qh.blog.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName blog
 * @ClassName BlogLoginController
 * @Description 博客登录
 * @Author mi
 * @Date 2019/11/15 14:30
 * @Version 1.0
 **/
@RestController
@Slf4j
public class BlogLoginController {

    @GetMapping("/login")
    public BaseResult<UserVo> loginBlog() {
        BaseResult<UserVo> userVoBaseResult=new BaseResult<>();
        UserVo userVo=new UserVo();
        userVo.setLoginName("test");
        userVoBaseResult.setData(userVo);
        return userVoBaseResult;
    }
}
