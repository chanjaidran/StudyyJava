package MutiThreading;

public class RaceCondition2 {

    public static void main(String[] args) {


//        CheckAndThen checkAndThen1=new CheckAndThen();
//        Thread thread1=new Thread(checkAndThen1,"Ramesh");
//        Thread thread2=new Thread(checkAndThen1,"payal");
//        thread1.start();
//        thread2.start();


        System.out.println("----------------------------------------");


        CheckAndThenSynchronised CheckAndThenSynchronised=new CheckAndThenSynchronised();
        Thread thread11=new Thread(CheckAndThenSynchronised,"Ramesh");
        Thread thread21=new Thread(CheckAndThenSynchronised,"payal");
        thread11.start();
        thread21.start();


    }
}

class CheckAndThen implements Runnable
{
int balance=100;

    @Override
    public void run() {

        System.out.println("Wiating to withdraw money "+Thread.currentThread().getName());

        if (balance>=100)
        {
            System.out.println("withdraw money "+Thread.currentThread().getName());
            balance-=50;

        }
        else {
            System.out.println("withrawal not done "+Thread.currentThread().getName());
            return;
        }

        System.out.println("withdrawal done "+balance);

    }


}

class CheckAndThenSynchronised implements Runnable {
    int balance = 100;

    @Override
    public void run() {

        System.out.println("Wiating to withdraw money sync " + Thread.currentThread().getName());

        synchronized (this) {
            if (balance >= 100) {
                System.out.println("withdraw money sync " + Thread.currentThread().getName());
                balance -= 50;

            } else {
                System.out.println("withrawal not done " + Thread.currentThread().getName());
            }

            System.out.println("withdrawal done "+Thread.currentThread().getName() +" "+ balance);

        }
    }
}
