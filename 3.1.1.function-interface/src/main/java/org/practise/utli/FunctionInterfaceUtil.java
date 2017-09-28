package org.practise.utli;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Admin on 2017/9/28.
 */
public class FunctionInterfaceUtil {

    /**
     * Predicate.
     *
     * @param list
     * @param predicate
     * @param <T>
     * @return
     */
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    /**
     * Consumer.
     *
     * @param list
     * @param consumer
     * @param <T>
     */
    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    /**
     * Function.
     *
     * @param list
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }
}
