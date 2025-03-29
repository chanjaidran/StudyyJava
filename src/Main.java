import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

      String  ttim = "a good   example";
        System.out.println(ttim.trim().replaceAll("\\s+", " "));
        String ttim2=ttim.trim().replaceAll("\\s+", " ");
        String[] arr=ttim2.split("\\s+");

        for (int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        StringBuilder builder=new StringBuilder();

        for (int i= arr.length-1;i>=0;i--)
        {
            builder.append(arr[i]);
        }
        System.out.println();

        


        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        funRecursion(1,5);
        funRecPrintNames("Jai",4);

        List<String> alphabets= Arrays.asList("a","b","c","d");

        alphabets.stream().sorted(String::compareTo).forEach(s -> System.out.println(s));
        alphabets.sort((a,b)->a.compareTo(b));
        System.out.println(alphabets);

       int[] candies = {12,1,12};
       int extraCandies = 10;

        System.out.println(kidsWithCandies(candies,extraCandies));


    }

    public static  void funRecursion(int n ,int m)
    {
        if(n>m)
            return;
        System.out.println(n);
        funRecursion(n+1,m);

    }

    public  static void funRecPrintNames(String name,int vount)
    {
        if (vount==0)
            return;

        System.out.println(name);

        funRecPrintNames(name,vount-1);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> booleans=new ArrayList<>();
        int max=Arrays.stream(candies).max().getAsInt();
        for (int i=0;i<candies.length;i++)
        {
            if (candies[i]+extraCandies>=max)
            {
                booleans.add(true);
            }
            else
            {
                booleans.add(false);
            }
        }

      return booleans;
    }
}