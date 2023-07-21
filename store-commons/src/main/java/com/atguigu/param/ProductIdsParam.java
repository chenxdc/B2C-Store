package com.atguigu.param;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * projectName: b2c-store
 * <p>
 * description: Category product display
 */
@Data
public class ProductIdsParam  extends PageParam{

    @NotNull
    private List<Integer> categoryID;
}
