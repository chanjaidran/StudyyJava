package DiamondProblems;

public class DiamondProblem {

    public static void main(String[] args) {

        D obj=new D();
        obj.show();

    }
}


interface A
{
    default  void show(){
        System.out.println("Show A");
    }


}

interface B
{
    default  void show(){
        System.out.println("Show B");
    }
}

interface C extends B
{
    default  void show(){
        System.out.println("Show C");
    }


}

class D implements A,B,C{

    @Override
    public void show() {
        C.super.show();
    }
}