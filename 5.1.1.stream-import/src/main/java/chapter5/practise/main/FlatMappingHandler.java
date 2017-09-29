package chapter5.practise.main;

import chapter5.practise.model.Dish;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * Created by Admin on 2017/9/29.
 */
public class FlatMappingHandler {

    private static final List<Dish> menu = Arrays.asList(new Dish(" pork", false, 800, Dish.Type.MEAT),
            new Dish(" beef", false, 700, Dish.Type.MEAT),
            new Dish(" chicken", false, 400, Dish.Type.MEAT),
            new Dish(" french fries", true, 530, Dish.Type.OTHER),
            new Dish(" rice", true, 350, Dish.Type.OTHER),
            new Dish(" season fruit", true, 120, Dish.Type.OTHER),
            new Dish(" pizza", true, 550, Dish.Type.OTHER),
            new Dish(" prawns", false, 300, Dish.Type.FISH),
            new Dish(" salmon", false, 450, Dish.Type.FISH));

    public static void main(String[] args) {
        menu.parallelStream().map(Dish::getName).map(x -> x.split("")).flatMap(Arrays::stream).distinct().collect
                (toList()).forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------------");

        List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> number2 = Arrays.asList(3, 4);

        List<int[]> ints = number1.stream().flatMap(i -> number2.stream().map(j -> new int[]{i, j})).collect(toList());

        System.out.println("-----------------------------------------------------------------------------------");

        List<int[]> filterInts = number1.stream().flatMap(i -> number2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[]{i, j})).collect(toList());

        System.out.println("-----------------------------------------------------------------------------------");

        Optional<int[]> first = number1.stream().flatMap(i -> number2.stream().map(j -> new int[]{i, j})).findFirst();
        if (first.isPresent()) {
            int[] ints1 = first.get();
            System.out.println("-----------------------------------------------------------------------------------");
        }

        System.out.println("-----------------------------------------------------------------------------------");

    }
}
