package com.fortunes.annotation;

/**
 * Created by HuoLiJun on 2018/3/20 0020.
 */
@OneAnnotation("I am an OneAnnotation for class")
public class Test2 {
    @OneAnnotation("zhangsan")
    public void test1(){
        System.out.println("Test2...");
    }
}
