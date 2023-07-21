package com.atguigu.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * projectName: b2c-store
 * <p>
 * description: Shopping cart query receiving parameters
 */
@Data
public class CartListParam {

    @JsonProperty("user_id")
    @NotNull
    private Integer userId;
}
