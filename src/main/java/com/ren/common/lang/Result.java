package com.ren.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : renwenhao
 * @date : 15:40 2021/1/18
 */
@Data
public class Result implements Serializable {

    private int code; // 200正常  非200异常
    private String msg;
    private Object data;

    public static Result success(Object data){
        return success(200,"操作成功",data);
    }

    public static Result fail(int code,String msg){
        return fail(code,msg,null);
    }

    public static Result fail(String msg,Object data){
        return fail(400,msg,data);
    }


    public static Result fail(int code,String msg,Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result success(int code,String msg,Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
