package com.atguigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * projectName: b2c-store
 * name: Xudong Chen
 * description: User's entity class
 */
@Data
@TableName("user")
public class User implements Serializable {

    public static final Long serialVersionUID = 1L;

    @JsonProperty("user_id") //Jackson's annotations for property initialization!
    @TableId(type =  IdType.AUTO)
    private Integer userId;

    @Length(min = 6)
    private String userName;
      //Ignore attributes, do not generate json, do not accept json data @JsonIgnore
      // @JsonInclude(JsonInclude.Include.NON_NULL)  + null When the value is not null, generate json, if it is null, it will not generate
      // Does not affect receiving json
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotBlank
    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotBlank
    private String userPhonenumber;
}
