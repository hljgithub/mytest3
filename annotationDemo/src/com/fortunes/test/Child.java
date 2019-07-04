package com.fortunes.test;

/**
 * Created by HuoLiJun on 2018/3/20 0020.
 */
public class Child extends Father {

    @Override
    public String sing() {
        return "music";
    }

    @Override
    public void eat() {
        System.out.println("");
    }

    public static void main(String[] args) {
     Father father = new Child();
     father.sing();

    }
}
