package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by renyuxiang on 2017/8/28.
 */

public class PredicateLambda extends BaseDemo {
    @Override
    public void test() {
        System.out.println("PredicateLambda Test>");
        List<String> list = new ArrayList() {{
            add("A");
            add("Aa");
            add("c");
        }};

        //        Predicate<String> predicate = s -> s.startsWith("a");
        //多条件联合
        //        predicate.and();
        //        predicate.or();
        //        predicate.negate();
        list.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);
        System.out.println("End>");
    }
}
