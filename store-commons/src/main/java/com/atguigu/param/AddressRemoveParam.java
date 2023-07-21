package com.atguigu.param;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * projectName: b2c-store
 * <p>
 * description:
 * Address Removal Parameters
 */
@Data
public class AddressRemoveParam {

    @NotNull
    private Integer id;
}
