package SDET_Programs.Strings;

public class StringReverse {

    public static void main(String[] args) {


        String anagram1="Silent";

        for (int i=anagram1.toCharArray().length-1;i>=0;i--)
        {
            System.out.print(anagram1.charAt(i)+"");
        }
        System.out.println();
        StringBuilder s=new StringBuilder(anagram1);
        System.out.println(s.reverse().toString());
    }
}
