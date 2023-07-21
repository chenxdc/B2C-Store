package com.atguigu.param;

import com.atguigu.pojo.Product;
import lombok.Data;

/**
 * projectName: b2c-store
 * <p>
 * description: Product data save param
 */
@Data
public class ProductSaveParam extends Product {

    /**
     * Save the picture address of the product details! Use + stitching between pictures
     */
    private String pictures;
}
