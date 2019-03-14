package com.czh.demo.common;

import org.springframework.context.annotation.Bean;

public class ResultMap<T> {
    private int code;
    private String msg;
    private T data;


    /**
     * 构造函数
     */
    private ResultMap(T data) {
        this.data = data;
    }

    private ResultMap(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private ResultMap(CodeMsg codeMsg) {
        if (codeMsg != null) {
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
        }
    }


    /**
     * 成功时候的调用
     */
    public static <T> ResultMap<T> success(T data) {
        return new ResultMap<T>(data);
    }


    /**
     * 失败时候的调用
     */
    public static <T> ResultMap<T> error(CodeMsg codeMsg) {
        return new ResultMap<T>(codeMsg);
    }


    //这里省略了getter和setter方法

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}