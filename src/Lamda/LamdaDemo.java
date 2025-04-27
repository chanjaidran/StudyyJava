package Lamda;

public class LamdaDemo {

    public static void main(String[] args) {

        Hello h=()-> System.out.println("Hi");
        h.hello();

        UseParam param=(name)->{
          String c=  name.toUpperCase();

            return c;
        };

        System.out.println(param.toUpper("jaichadran"));

    }
}
