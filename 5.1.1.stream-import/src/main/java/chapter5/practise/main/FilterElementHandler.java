package chapter5.practise.main;

import java.util.Arrays;
import java.util.List;

public class FilterElementHandler {

    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        elements.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);
    }
}
