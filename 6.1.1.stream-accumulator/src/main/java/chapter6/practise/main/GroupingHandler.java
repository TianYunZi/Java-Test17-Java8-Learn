package chapter6.practise.main;

import chapter6.practise.enums.CaloricLevel;
import chapter6.practise.model.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class GroupingHandler {

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

        System.out.println("-----------------------------------------------------------------------------------");

        Map<Dish.Type, List<Dish>> collect = menu.stream().collect(groupingBy(Dish::getType));

        System.out.println("-----------------------------------------------------------------------------------");

        Map<CaloricLevel, List<Dish>> caloricLevelListMap = menu.stream().collect(groupingBy(dish -> {
            if (dish.getCalories() <= 400) {
                return CaloricLevel.DIET;
            } else if (dish.getCalories() <= 700) {
                return CaloricLevel.NORMAL;
            } else {
                return CaloricLevel.FAT;
            }
        }));

        System.out.println("-----------------------------------------------------------------------------------");
    }
}
