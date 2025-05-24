package Test.String;

public class Palindrome {

    public static void main(String[] args) {

        String s="madams";
        char[] arr=s.toCharArray();
        String str="";

        StringBuilder stringBuilder=new StringBuilder(s);
        String s1=stringBuilder.reverse().toString();
        if (s.equals(s1))
            System.out.println("pal");
        else
            System.out.println("not pal");



        for(int i=s.length()-1;i>=0;i--)
        {
            str=str+s.charAt(i);
        }

        System.out.println(str);
    }
}
