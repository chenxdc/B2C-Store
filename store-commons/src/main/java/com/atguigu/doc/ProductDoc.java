package com.atguigu.doc;

import com.atguigu.pojo.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * projectName: b2c-store
 * <p>
 * description: Entity class used to store product search data
 */
@Data
@NoArgsConstructor
public class ProductDoc extends Product {

    /**
     * Combination of product title and product title and product description
     */
    private String all;

    public ProductDoc(Product product) {
       super(product.getProductId(),product.getProductName(),product.getCategoryId(),
               product.getProductTitle(),product.getProductIntro(),product.getProductPicture(),
               product.getProductPrice(),product.getProductSellingPrice(),product.getProductNum(),
               product.getProductSales());

       this.all = product.getProductName()+product.getProductTitle()+product.getProductIntro();
    }
}
