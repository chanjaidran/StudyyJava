package MutiThreading;

public class UsingRunnable {
    public static void main(String[] args) {

        MyRunnable runnable=new MyRunnable();
        Thread t1=new Thread(runnable);
        t1.start();
        Thread t2=new Thread(runnable);
        t2.start();
    }
}

class MyRunnable implements Runnable
{

    @Override
    public void run() {
        System.out.println("Runnable "+Thread.currentThread().getName());
    }
}


