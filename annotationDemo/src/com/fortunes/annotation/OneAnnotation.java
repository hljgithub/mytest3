package com.fortunes.annotation;

import java.lang.annotation.*;

/**
 * Created by HuoLiJun on 2018/3/14 0014.
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Inherited //注解的继承只会继承类上的注解，不会继承方法上的注解
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OneAnnotation {
    String value();
}
