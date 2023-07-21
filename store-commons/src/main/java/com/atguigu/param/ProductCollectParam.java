package com.atguigu.param;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * projectName: b2c-store
 * <p>
 * description: Collect the parameters passed by calling the product
 */
@Data
public class ProductCollectParam {

    @NotEmpty
    private List<Integer> productIds;
}
