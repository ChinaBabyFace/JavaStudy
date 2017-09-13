package com.example;

import com.example.demo.ListenerLambda;
import com.example.demo.BaseDemo;
import com.example.demo.StreamLambda;
import com.example.demo.PredicateLambda;
import com.example.demo.RunnableLambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BaseDemo> list = new ArrayList<>();
        list.add(new RunnableLambda());
        list.add(new ListenerLambda());
        list.add(new PredicateLambda());
        list.add(new StreamLambda());
        list.forEach(demo -> {
            demo.test();
        });
    }

}
