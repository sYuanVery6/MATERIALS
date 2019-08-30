package com.example.auth;

import java.lang.annotation.*;

@Inherited//子类自动继承
@Target({ElementType.METHOD, ElementType.TYPE})//注解存放位置
@Retention(RetentionPolicy.RUNTIME)//注解生命周期
@Documented//生成注解文档
public @interface UserPermission {
    String user() default "";
}
