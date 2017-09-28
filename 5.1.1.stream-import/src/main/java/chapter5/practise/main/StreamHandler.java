package chapter5.practise.main;

import chapter5.practise.model.Dish;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by Admin on 2017/9/28.
 */
public class StreamHandler {

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
        List<String> result = menu.parallelStream().map(Dish::getName).collect(toList());
        result.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------------");

        List<String> names = menu.parallelStream().filter(x -> {
            System.out.println("filtering: " + x.getName());
            return x.getCalories() > 300;
        }).map(x -> {
            System.out.println("mapping: " + x.getName());
            return x.getName();
        }).limit(3).collect(toList());
        System.out.println(names);

        System.out.println("-----------------------------------------------------------------------------------");
    }
}
