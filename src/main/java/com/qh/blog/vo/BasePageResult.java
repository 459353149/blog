package com.qh.blog.vo;

import lombok.Data;
import lombok.ToString;

/**
 * @ProjectName blog
 * @ClassName BasePageResult
 * @Description TODO
 * @Author mi
 * @Date 2019/11/15 14:40
 * @Version 1.0
 **/
@Data
@ToString
public class BasePageResult<T> {
    private Integer pageIndex;
    private Integer pageSize;
    private Integer totalCount;
    private T data;
    private String code;
    private String msg;

}
