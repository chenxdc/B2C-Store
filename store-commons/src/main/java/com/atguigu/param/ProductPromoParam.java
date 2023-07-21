package com.atguigu.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * projectName: b2c-store
 * <p>
 * description: Parameter reception of popular products in the category
 */
@Data
public class ProductPromoParam {

    @NotBlank
    private String categoryName;
}
