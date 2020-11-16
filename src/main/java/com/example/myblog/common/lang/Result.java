package com.example.myblog.common.lang;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
public class Result {
    private String code;
    private String msg;
    private Object data;

    public static Result success(Object data){
        return success("200", "请求成功", data);
    }
    public static Result success(String code, String msg, Object data){
        return Result.builder().code(code).msg(msg).data(data).build();
    }
    public static Result fail(Object data){
        return fail("400", "请求失败", data);
    }
    public static Result fail(String code, String msg, Object data) {
        return Result.builder().code(code).msg(msg).data(data).build();
    }
}
