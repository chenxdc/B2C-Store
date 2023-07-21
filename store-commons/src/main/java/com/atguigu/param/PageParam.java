package com.atguigu.param;

import lombok.Data;

/**
 * projectName: b2c-store
 * <p>
 * description: pagination properties
 */
@Data
public class PageParam {

    private int currentPage = 1; //default value 1
    private int pageSize = 15; //default value 15
}
