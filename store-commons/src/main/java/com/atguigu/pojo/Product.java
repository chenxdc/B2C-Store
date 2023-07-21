package com.atguigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * projectName: b2c-store
 * <p>
 * description: The entity class of the product
 */
@Data
@TableName("product")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true )
public class Product implements Serializable {

    public static final Long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @JsonProperty("product_id")
    private Integer productId;

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("category_id")
    private String categoryId;

    /**
     * Cell title
     */
    @JsonProperty("product_title")
    private String productTitle;

    /**
     * Cell Description
     */
    @JsonProperty("product_intro")
    private String productIntro;

    @JsonProperty("product_picture")
    private String productPicture;

    /**
     * Product price
     */
    @JsonProperty("product_price")
    private Double productPrice;

    /**
     * Selling price
     */
    @JsonProperty("product_selling_price")
    private Double productSellingPrice;

    /**
     * Product stocks
     */
    @JsonProperty("product_num")
    private int productNum;

    /**
     * already sold number
     */
    @JsonProperty("product_sales")
    private int productSales;


}