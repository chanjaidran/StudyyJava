package MutiThreading;

public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {

        ReadMoidifyWrite readMoidifyWrite=new ReadMoidifyWrite();
        Thread t1=new Thread(readMoidifyWrite);
        Thread t2=new Thread(readMoidifyWrite);

        t1.start();;
        t2.start();

        t1.join();
        t2.join();

        System.out.println("count "+ readMoidifyWrite.getSharedCount());

    }
}

class  ReadMoidifyWrite implements Runnable
{

    int shared=0;

    @Override
    public void run() {

        //USe Synchronised(this)

            for (int i = 0; i < 1000000; i++) {
                shared++;
            }

    }

    public  synchronized int getSharedCount() {
        return shared;
    }
}
