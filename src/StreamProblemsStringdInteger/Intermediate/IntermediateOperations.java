package StreamProblemsStringdInteger.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperations {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("Jai","Chan","Dran","Jake");
        List<String> Fruits=Arrays.asList("Apple","Orange","Banana");

        List<Integer> numbers=Arrays.asList(1,2,3,1,5,2,6);
        List<String> stringNumbers=Arrays.asList("1","2","3");

        List<List<String>> cominedList=Arrays.asList(names,Fruits);

        //Filter
        names.stream().filter(n->n.startsWith("J")).forEach(System.out::println);

        //Map
        names.stream().map(n->n.toUpperCase()).forEach(s -> System.out.print(s+" "));
        System.out.println();

        //FlatMap
        cominedList.stream().flatMap(List::stream).forEach(System.out::println);
        cominedList.stream().flatMap(l->l.stream()).map(s->s.toLowerCase()).forEach(s-> System.out.print(s+" "));
        System.out.println();
        System.out.println(cominedList);

        //Distinct
        numbers.stream().distinct().forEach(s-> System.out.print(s+" "));
        System.out.println();

        //Sorted
        numbers.stream().sorted().forEach(s-> System.out.print(s+" "));
        System.out.println();
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.print(s+" "));
        System.out.println();

        //Limit
        numbers.stream().limit(3).forEach(s-> System.out.print(s+" "));
        System.out.println();

        //Skip
        numbers.stream().skip(3).forEach(s-> System.out.print(s+" "));

        //MapToInt
        int sum=stringNumbers.stream().mapToInt(Integer::parseInt).sum();

        System.out.println(sum);

        //Reduce
       // To get Single Value Sum,Multiply
        //reduce() is used to combine all elements of a stream into a single result — like sum, product, or max — using a BinaryOperator.

      int summ=  numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(summ);

       int mul=numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println(mul);

        int max=numbers.stream().max(Integer::compareTo).get();
        System.out.println(max);

      int maxx=  numbers.stream().reduce((a,b)->a>b?a:b).get();
        System.out.println(maxx);



    }
}
