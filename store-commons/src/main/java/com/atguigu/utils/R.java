package com.atguigu.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * projectName: b2c-store
 * @author: Xudong Chen
 * time: 07/15/2023
 * description: Return result universal object  Map
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R  implements Serializable{

    public static final Long serialVersionUID = 1L;


    /**
     * Universal success status code
     */
    public static final String SUCCESS_CODE = "001";
    /**
     * Failure status code
     */
    public static final String FAIL_CODE = "004";
    /**
     * Not logged in
     */
    public static final String USER_NO_LOGIN = "401";


    private String code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String msg;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long   total;


    /**
     * Successful
     * @param msg
     * @param data
     * @return
     */
    public static R ok(String msg,Object data,Long total){

        return new R(SUCCESS_CODE,msg,data,total);
    }

    /**
     * Successful
     * @param data
     * @return
     */
    public static R ok(String msg,Object data){

        return ok(msg,data,null);
    }

    /**
     * Successful
     * @return
     */
    public static R ok(String msg){

        return ok(msg,null);
    }


    /**
     * Successful
     * @return
     */
    public static R ok(Object data){

        return ok(null,data);
    }



    /**
     * Failed
     * @param msg
     * @param data
     * @return
     */
    public static R fail(String msg,Object data,Long total){

        return new R(FAIL_CODE,msg,data,total);
    }

    /**
     * Failed
     * @param data
     * @return
     */
    public static R fail(String msg,Object data){

        return fail(msg,data,null);
    }

    /**
     * Failed
     * @return
     */
    public static R fail(String msg){

        return fail(msg,null);
    }


    /**
     * Failed
     * @return
     */
    public static R fail(Object data){

        return fail(null,data);
    }


    /**
     * Not logged in
     * @return
     */
    public static R NO_LOGIN(){

        return fail(USER_NO_LOGIN,"User not logged in!");
    }






}
