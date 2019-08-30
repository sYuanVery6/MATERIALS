package com.example.result;

public class ResultFactory {

    public static Result bulidSuccessResult(Object data){
        return buildResult(ResultCode.SUCCESS,"成功",data);
    }

    public static Result bulidFailResult(String message){
        return buildResult(ResultCode.FAIL,message,null);
    }

    public static Result buildResult(ResultCode resultCode,String msg,Object data){
        return new Result(resultCode.code,msg,data);
    }

    public static Result buildResult(Integer code,String msg,Object data){
        return new Result(code,msg,data);
    }

}
