package SDET_Programs.Arrays;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args) {

        int arr[]={3,2,7,8,1};
        Arrays.stream(arr).sorted().forEach(s-> System.out.println(s));

    }
}
