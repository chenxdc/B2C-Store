package com.atguigu.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * projectName: b2c-store
 * name: Xudong Chen
 * description: Param that receives front -end parameters
 * TODO: Use the annotation of JSR 303 for parameter check!
 * @NotBlank String type            cannot be NULL and empty string " "
 * @NotNull  String type            cannot be NULL
 * @NotEmpty The collection type    collection length cannot be 0
 */
@Data
public class UserCheckParam {

    @NotBlank
    private String userName; //Note: The parameter name should be equal to the name of the JSON Key transmitted by the front end!
}
