package StreamProblemsStringdInteger;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9,10,1);

        integerList.stream().sorted(Comparator.reverseOrder()).limit(3).skip(2).forEach(System.out::println);
        String name="ABRACADABRAA";

       String a= name.chars().mapToObj(c->String.valueOf((char) c)).distinct().collect(Collectors.joining());
        System.out.println(a);
        List<String> stringList=Arrays.asList("a","b","c","d","e");
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};

        //Separate odd and even

       Map<Boolean,List<Integer>>  oddAnEven=integerList.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println(oddAnEven);

        //Groupinby for own name
        Map<String,List<Integer>>  oddAnEvenSpecificString=integerList.stream().collect(Collectors.groupingBy((i)->{
            if(i%2==0)
                return "even";
            else
                return "odd";
        }));
        System.out.println(oddAnEvenSpecificString);

        //Remove duplicates

        integerList.stream().distinct().forEach(s-> System.out.print(s+" "));

        //Remove duplicates in String
        name.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());

        System.out.println();

        //Frequency of each character in String
       Map<Character, Long> charcount= name.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        System.out.println("charcount");
        System.out.println(charcount);

        //Most Frequent count
        char mostFrequentChar = '\0';
        long maxCount = 0;
        for (Map.Entry<Character, Long> entry : charcount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }


        //Frequency of element in list

       Map<Integer,Long> count= integerList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count);

        //sort list in reverse order
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.print(s+" "));
        System.out.println();

        //Join List of Strings
      String joined=  stringList.stream().collect(Collectors.joining("-","{","}"));
        System.out.println(joined);

        //MaxMin in list

     int max=   integerList.stream().max(Integer::compareTo).get();
     int min=   integerList.stream().min(Integer::compareTo).get();



        System.out.println(max+" "+min);

        //multiples of 2
        integerList.stream().filter(i->i%2==0).forEach(s-> System.out.print(s+" "));
        System.out.println("");

        //join array
        int arr[]= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).toArray();
        for (int i : arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(Arrays.stream(arr).max().getAsInt());


        //Sort a String

        name.chars().sorted().mapToObj(c->(char) c).forEach(s-> System.out.print(s+" "));
        System.out.println();
        String sortname=name.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
        System.out.println(sortname);

    }
}
