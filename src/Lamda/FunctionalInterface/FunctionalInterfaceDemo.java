package Lamda.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {


        Function<String,String> fun=(name)->{
            return name.toUpperCase();
        };

        System.out.println(fun.apply("Jai"));


        Predicate<Integer> predicate=i->i>10;
        System.out.println(predicate.test(2));

        Consumer<Integer> consumer=(i)-> System.out.println(i);
        consumer.accept(10);

        Supplier<String> stringSupplier=()-> {
            return "Hello";
        };
        System.out.println(stringSupplier.get());
    }
}
