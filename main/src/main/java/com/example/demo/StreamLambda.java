package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by renyuxiang on 2017/8/29.
 */

public class StreamLambda extends BaseDemo {
    @Override
    public void test() {
        System.out.println("StreamLambda Test>");

        List<String> list = new ArrayList() {{
            add("A");
            add("A");
            add("B");
            add("C");
        }};
        System.out.println("Stream Map Test:");
        list.stream().map(s -> s + "-checked").forEach(System.out::println);
        System.out.println("Stream distinct Test:");
        list.stream().distinct().forEach(System.out::println);
        String result = list.stream().reduce((sum, cost) -> sum + cost).get();
        System.out.println("Stream reduce Test:" + result);
        System.out.println("End>");
    }

    class Node {
        private String name;

        public Node(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
