package chapter5.practise.main;

import chapter5.practise.model.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by Admin on 2017/9/29.
 */
public class ValueStreamHandler {

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
        int sum = menu.stream().mapToInt(Dish::getCalories).sum();
        System.out.println(sum);

        System.out.println("-----------------------------------------------------------------------------------");

        menu.stream().mapToInt(Dish::getCalories).boxed().collect(toList()).forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------------");

        OptionalInt max = menu.stream().mapToInt(Dish::getCalories).max();
        if (max.isPresent()) {
            System.out.println(max.getAsInt());
        }

        System.out.println("-----------------------------------------------------------------------------------");

        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(10).map(t -> t[0]).forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------------");
    }
}
