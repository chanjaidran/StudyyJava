package SDET_Programs.Strings;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StringIsPalindrome {

    public static void main(String[] args) {
        String s= "AbbA";
        String anagram1="Silent";
        String anagram2="Listen";

       String s1=anagram1.toLowerCase().chars().mapToObj(c->String.valueOf((char)c)).sorted(Comparator.reverseOrder()).collect(Collectors.joining());

        String s2=anagram2.toLowerCase().chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());

        System.out.println(s1+" "+s2);





        StringBuilder stringBuilder=new StringBuilder(s);
        String s3=stringBuilder.reverse().toString();

        if (s.equals(s3))
            System.out.println("pal");
        else
            System.out.println("not pal");

        System.out.println(stringBuilder);
    }
}
