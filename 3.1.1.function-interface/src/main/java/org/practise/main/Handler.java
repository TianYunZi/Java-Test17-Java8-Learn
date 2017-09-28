package org.practise.main;

import org.practise.utli.FunctionInterfaceUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Admin on 2017/9/28.
 */
public class Handler {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        FunctionInterfaceUtil.filter(strings, x -> !x.isEmpty());

        System.out.println("-----------------------------------------------------------------------------------");

        FunctionInterfaceUtil.forEach(Arrays.asList(1, 2, 3, 4, 5), x -> System.out.println(x));

        System.out.println("-----------------------------------------------------------------------------------");

        List<Integer> map = FunctionInterfaceUtil.map(Arrays.asList("abc", "dddda", "dhehdhe", "shjss", "akkaa", "hjsjsj"),
                String::length);
        FunctionInterfaceUtil.forEach(map, t -> System.out.println(t));

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
    }
}
