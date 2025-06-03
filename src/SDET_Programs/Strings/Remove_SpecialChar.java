package SDET_Programs.Strings;

public class Remove_SpecialChar {

    public static void main(String[] args) {

        String name="!jaichan#$@#dra122n";
        String a=name.replaceAll("[^a-zA-Z0-9]","");
        String b=name.replaceAll("[a-zA-Z0-9]","");
        System.out.println(a);
        System.out.println(b);
    }
}
