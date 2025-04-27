package SDET_Programs.Strings;

public class InsertAStringIIndex {

    public static void main(String[] args) {

          String originalString = "GeeksGeeks";
          String stringToBeInserted = "For";
          int  index = 5;


          StringBuilder s=new StringBuilder(originalString);
          s.insert(index,stringToBeInserted);

        System.out.println(s);

    }
}
