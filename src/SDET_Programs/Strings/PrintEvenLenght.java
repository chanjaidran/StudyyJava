package SDET_Programs.Strings;

public class PrintEvenLenght {
    public static void main(String[] args) {

        String s="This is a java language";
       String arr[]=s.split(" ");

       for (String i:arr)
       {
           if (i.length()%2==0)
           {
               System.out.println(i);
           }
       }
    }
}
