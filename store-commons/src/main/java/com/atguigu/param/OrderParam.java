package com.atguigu.param;

import com.atguigu.vo.CartVo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * projectName: b2c-store
 * <p>
 * description: The param of the order receiving parameters
 */
@Data
public class OrderParam implements Serializable {

    public static final Long serialVersionUID = 1L;

    @JsonProperty("user_id")
    private Integer userId;
    private List<CartVo> products;
}
