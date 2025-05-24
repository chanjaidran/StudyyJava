package Test.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateCharacters {

    public static void main(String[] args) {


        String s1="jaichandran";

        char[] chars=s1.toCharArray();
        Set<Character> set=new HashSet<>();
        Set<Character> characters=new HashSet<>();

        for (int i=0;i<chars.length;i++)
        {
            for(int j=i+1;j<chars.length;j++)
            {
                if(chars[i]==chars[j])
                {
                    set.add(chars[i]);
                }
                else
                {
                    characters.add(chars[i]);
                }
            }
        }
        System.out.println(s1);

        System.out.println(set);
        System.out.println(characters);


    }
}
