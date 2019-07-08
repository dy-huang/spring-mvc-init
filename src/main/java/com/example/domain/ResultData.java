package com.example.domain;

import lombok.Data;

/**
 * ResultData
 */
@Data
public class ResultData<T> {

    /**
     * 状态返回码：
     *  0：请求成功
     *  1:请求失败
     */
    private Integer code;

    private String msg;

    private T data;


    public ResultData(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}