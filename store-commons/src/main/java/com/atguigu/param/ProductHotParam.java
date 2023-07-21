package com.atguigu.param;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * projectName: b2c-store
 * <p>
 * description: Popular product parameter receiving object
 */
@Data
public class ProductHotParam {

    @NotEmpty
    private List<String> categoryName;
}
