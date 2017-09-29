package chapter5.practise.main;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by Admin on 2017/9/29.
 */
public class MappingHandler {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        words.stream().map(String::length).collect(toList()).forEach(System.out::println);
    }
}
