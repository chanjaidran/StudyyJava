package DiamondProblems;

interface A {
    default void show() {
        System.out.println("Show A");
    }
}

interface B extends A {
    default void show() {
        System.out.println("Show B");
    }
}

interface C extends A {
    default void show() {
        System.out.println("Show C");
    }

    static void add()
    {
        System.out.println("Add");
    }
}

class D implements B, C{
    @Override
    public void show() {
        // Resolving the conflict by calling A's show method
        B.super.show();  // This works and calls A's version
    }


}
public class DiamondProblem {


    public static void main(String[] args) {
        D obj = new D();
        obj.show();  // Should print: Show A

    C.add();
    }
}



