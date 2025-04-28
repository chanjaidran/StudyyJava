package SDET_Programs.Strings;

public class FindEvenLenthStatingVowelWord {

    public static void main(String[] args) {

        String name="jai the tis even good boy";
        String arr[]=name.split(" ");

        for (String i:arr)
        {
            if (i.length()%2==0)
            {

                if (i.charAt(0)=='a'|| i.charAt(0)=='i'|| i.charAt(0)=='e'|| i.charAt(0)=='o'|| i.charAt(0)=='u')
                {
                    System.out.println(i);
                    break;
                }
            }

        }

    }
}
