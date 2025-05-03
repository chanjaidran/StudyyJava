package MutiThreading;

public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {


        Thread thread1=new Thread(()->{

            try {
                for (int i=1;i<=10;i++)
                    System.out.println(i+" thread1");
                     Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        });


        Thread thread2=new Thread(()->{
            try {
                for (int i=1;i<=10;i++)
                {
                    System.out.println(i+" thread 2");
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });


        Thread daemonthread=new Thread(()->{
            try {
            for (int i=0;i<=10;i++)
            {
                System.out.println(i+" DaemonThread");
                Thread.sleep(2000);
            }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Runnable runnable=()->{
            for (int i=0;i<=10;i++)
                try {
                System.out.println("kk");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

       Thread thread=new Thread(runnable);
       thread.setDaemon(true);
       thread.start();


        thread1.start();

        thread2.start();



        daemonthread.setDaemon(true);
        daemonthread.start();


    }
}
