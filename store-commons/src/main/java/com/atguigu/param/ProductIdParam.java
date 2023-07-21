package com.atguigu.param;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * projectName: b2c-store
 * <p>
 * description: Product id parameter reception
 */
@Data
public class ProductIdParam {

    @NotNull
    private Integer productID;
}
