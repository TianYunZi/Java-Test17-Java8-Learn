package chapter5.practise.main;

import chapter5.practise.model.Trader;
import chapter5.practise.model.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * Created by Admin on 2017/9/29.
 */
public class ReducingHandler {

    Trader raoul = new Trader(" Raoul", "Cambridge");
    Trader mario = new Trader(" Mario", " Milan");
    Trader alan = new Trader(" Alan", " Cambridge");
    Trader brian = new Trader(" Brian", " Cambridge");

    private final List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950));

    public static void main(String[] args) {
        new ReducingHandler().transactions.stream().filter(x -> x.getYear() == 2011).sorted(Comparator.comparing
                (Transaction::getValue)).collect(toList()).forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------------------");

        String result = new ReducingHandler().transactions.stream().map(x -> x.getTrader().getName()).distinct().sorted()
                .collect(joining());
        System.out.println(result);

        System.out.println("-----------------------------------------------------------------------------------");

        boolean milan = new ReducingHandler().transactions.stream().anyMatch(transaction -> transaction.getTrader()
                .getCity().trim().equals("Milan"));
        System.out.println(milan);

        System.out.println("-----------------------------------------------------------------------------------");
    }
}
