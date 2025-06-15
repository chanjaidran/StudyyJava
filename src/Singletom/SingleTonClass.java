package Singletom;

public class SingleTonClass {

    private SingleTonClass()
    {

    }

    static  SingleTonClass singleobject=null;


    static  SingleTonClass getInstance()
    {
        if (singleobject==null)
            singleobject=new SingleTonClass();
        return  singleobject;
    }

    public void checkLog(String message)
    {
        System.out.println("Mesaage");
    }
}

class Check
{
    public static void main(String[] args) {

        SingleTonClass singleTonClass=SingleTonClass.getInstance();
        singleTonClass.checkLog("Hello");
    }
}
