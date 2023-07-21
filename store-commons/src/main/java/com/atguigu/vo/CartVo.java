package com.atguigu.vo;

import com.atguigu.pojo.Cart;
import com.atguigu.pojo.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * projectName: b2c-store
 * <p>
 * description: Add the returned vo object to the shopping cart
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
public class CartVo implements Serializable {

    private Integer id;  //Cart id
    private Integer productID;  //Product id
    private String  productName; //Product name
    private String  productImg; //Product picture
    private Double price;  //Product price
    private Integer num;  //purchase product number
    private Integer maxNum; //Product purchase limit
    private Boolean check = false; //Whether to select

    public CartVo(Product product, Cart cart) {
        this.id = cart.getId();
        this.productID = product.getProductId();
        this.productName = product.getProductName();
        this.productImg = product.getProductPicture();
        this.price = product.getProductSellingPrice();
        this.num = cart.getNum();
        this.maxNum = product.getProductNum();
        this.check = false;
    }
}