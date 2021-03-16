package com.atguigu.eduservice.exceptionHandler;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //生成有参数的构造方法
@NoArgsConstructor //生成无参构造
public class GuliException extends RuntimeException{
    //异常状态码
    private Integer code;

    //异常信息
    private String msg;
}
