package com.atguigu.param;

import lombok.Data;

/**
 * projectName: b2c-store
 * <p>
 * description: Collection of search keywords and pagination parameters
 */
@Data
public class ProductSearchParam extends PageParam{

    private String search;

}
