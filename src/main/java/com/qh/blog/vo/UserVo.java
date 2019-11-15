package com.qh.blog.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ProjectName blog
 * @ClassName UserVo
 * @Description TODO
 * @Author mi
 * @Date 2019/11/15 14:32
 * @Version 1.0
 **/
@Data
@ToString
public class UserVo implements Serializable {
    private static final long serialVersionUID = -854696824014515110L;
    private String id;
    private String userName;
    private String userPassWord;
    private String loginName;
}
