package com.wonder4work.active.utils;

import lombok.Data;

import java.util.List;

/**
 * @since 1.0.0 2020/4/11
 */
@Data
public class PagedGridResult {
    // 当前页数
    private int page;
    // 总页数
    private int total;
    // 总记录数
    private long records;
    // 每行显示的内容
    private List<?> rows;

}
