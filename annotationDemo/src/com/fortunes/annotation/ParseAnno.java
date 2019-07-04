package com.fortunes.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by HuoLiJun on 2018/3/20 0020.
 */
public class ParseAnno {
    public static void main(String[] args) {
        ParseAnno.parseAnno2();
    }

    /**
     * 解析注解方法一
     */
    public static void parseAnno1() {
        try {
            Class<?> aClass = Class.forName("com.fortunes.annotation.TestAnno");
            //判断类上是否存在注解
            boolean annotationPresentExist = aClass.isAnnotationPresent(OneAnnotation.class);
            if (annotationPresentExist) {
                OneAnnotation annotation = (OneAnnotation) aClass.getAnnotation(OneAnnotation.class);
                System.out.println("类注解的值是：" + annotation.value());
            }
            //找到方法上的注解
            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
                boolean annotationPresentMethod = method.isAnnotationPresent(OneAnnotation.class);
                if (annotationPresentMethod) {
                    OneAnnotation methodAnnotation = method.getAnnotation(OneAnnotation.class);
                    System.out.println("方法注解的内容是：" + methodAnnotation.value());
                }

            }
            System.out.println("////////////////////////////////");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 解析注解方法二
     */
    public static void parseAnno2() {
        try {
            Class<?> aClass = Class.forName("com.fortunes.annotation.TestAnno");
            Annotation[] annotations = aClass.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof OneAnnotation) {
                    OneAnnotation oClass = (OneAnnotation) annotation;
                    System.out.println("类上的注解是："+oClass.value());
                }
            }
            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
                Annotation[] annotations1 = method.getAnnotations();
                for (Annotation annotation : annotations1) {
                    if (annotation instanceof OneAnnotation) {
                        OneAnnotation oClass = (OneAnnotation) annotation;
                        System.out.println("方法上的注解是："+oClass.value());
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
