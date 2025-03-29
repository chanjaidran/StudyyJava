package MutiThreading;

public class UsingThread {
    public static void main(String[] args) {

        Mythread thread1=new Mythread();
        thread1.start();

        Mythread thread2=new Mythread();
        thread2.start();
    }
}

class Mythread extends Thread{

    @Override
    public void run() {

        System.out.println("Thread is executing "+Thread.currentThread().getName());
    }
}
