package chapter5.practise.main;

import chapter5.practise.model.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Admin on 2017/9/29.
 */
public class ReducingHandler {

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
        Integer reduce = menu.parallelStream().map(Dish::getCalories).reduce(0, Integer::sum);
        System.out.println(reduce);

        Optional<Integer> max = menu.parallelStream().map(Dish::getCalories).reduce(Integer::max);
        if (max.isPresent()) {
            System.out.println(max.get());
        }

        Optional<Integer> min = menu.parallelStream().map(Dish::getCalories).reduce(Integer::min);
        if (min.isPresent()) {
            System.out.println(min.get());
        }
    }
}
