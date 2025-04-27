package SDET_Programs.Strings;

import java.util.HashMap;
import java.util.Map;

public class TotalNumberVowels {

    public static void main(String[] args) {


        String s="Artificial Intelligence is Future";
        s=s.replaceAll("\\s","").toLowerCase();

       // String a=s.replace(" ","");
        //System.out.println(a.toLowerCase());

        System.out.println(s);
        int count=0;
        for (char c:s.toCharArray())
        {
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
            {
                count++;

            }
        }

        Map<Character,Integer> map=new HashMap<>();

        for(char c:s.toCharArray())
        {
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }

        System.out.println(map);
        System.out.println(count);
    }
}
