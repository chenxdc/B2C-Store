package com.atguigu.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * projectName: b2c-store
 * <p>
 * description: Backend management order display entity object
 */
@Data
public class AdminOrderVo implements Serializable {

    public static final Long serialVersionUID = 1L;

    @JsonProperty("order_id")
    private Long orderId;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("product_num")
    private Integer productNum; //Product category
    @JsonProperty("order_num")
    private Integer orderNum; //product number in the order
    @JsonProperty("order_price")
    private Double  orderPrice; //amount of order
    @JsonProperty("order_time")
    private Long    orderTime; //order time
}
