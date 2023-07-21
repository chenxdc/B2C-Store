package com.atguigu.to;

import lombok.Data;

import java.io.Serializable;

/**
 * projectName: b2c-store
 * <p>
 * description: The entity that ordered the goods service
 */

@Data
public class OrderToProduct implements Serializable {

    public static final Long serialVersionUID = 1L;


    private Integer productId;
    private Integer num;

}
