package SDET_Programs.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacters {

    public static void main(String[] args) {


        String name="Jaiaichndran";





        Set<Character> se1=new HashSet<>();
        Set<Character> se2=new HashSet<>();
        Set<Character> se3=new HashSet<>();

char[] chars=name.toCharArray();


for (int i=0;i<chars.length;i++)
{
    for (int j=i+1;j<chars.length;j++)
    {
        if (chars[i]==chars[j]) {
            System.out.println(chars[i]);
            se3.add(chars[i]);
        }
    }
}

        System.out.println(se3);


        System.out.println("---------------------------------------");
        Map<Character,Integer> map=new HashMap<>();

        for(char c:chars) {
            map.put(c,map.getOrDefault(c,0)+1);

        }

        System.out.println(map);

        for (Map.Entry<Character,Integer> m:map.entrySet())
        {
            if (m.getValue()>1)
                System.out.println(m.getKey());

        }



        for (char c:name.toCharArray())
        {
//            if(!se1.add(c))
//               se2.add(c);

            if(se1.contains(c))
                se2.add(c);
            else
                se1.add(c);

        }


        System.out.println(se2.toString());
        System.out.println(se1);

    }


}
