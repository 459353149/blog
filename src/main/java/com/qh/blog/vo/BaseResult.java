package com.qh.blog.vo;

import lombok.Data;
import lombok.ToString;

/**
 * @ProjectName blog
 * @ClassName BaseResult
 * @Description TODO
 * @Author mi
 * @Date 2019/11/15 14:38
 * @Version 1.0
 **/
@Data
@ToString
public class BaseResult<T> {
    private String code;
    private T data;
    private String msg;

}
