package com.example.demo;

/**
 * Created by renyuxiang on 2017/8/28.
 */

public class RunnableLambda extends BaseDemo {
    @Override
    public void test() {
        System.out.println("RunnableLambda Test>");
        new Thread(() -> System.out.println("RunableLamada running")).start();
        System.out.println("End>");
    }
}
