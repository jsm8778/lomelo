package com.lomelo.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {
    private boolean success;
    private String message;
    private Object data;

    public static Result Create(){
        Result result = new Result();
        result.setSuccess(true);
        result.setMessage("Success");
        result.setData(null);
        return result;
    }

    public static Result Create(boolean isSuccess){
        Result result = new Result();
        result.setSuccess(isSuccess);
        result.setMessage(isSuccess? "Success" : "failed");
        result.setData(null);
        return result;
    }

    public static Result Create(boolean isSuccess, String message){
        Result result = new Result();
        result.setSuccess(isSuccess);
        result.setMessage(message);
        result.setData(null);
        return result;
    }

    public static Result Create(boolean isSuccess, Object data){
        Result result = new Result();
        result.setSuccess(isSuccess);
        result.setMessage(isSuccess? "Success" : "failed");
        result.setData(data);
        return result;
    }

    public static Result Create(boolean isSuccess, String message, Object data){
        Result result = new Result();
        result.success = isSuccess;
        result.message = message;
        result.data    = data;

        return result;
    }
}


