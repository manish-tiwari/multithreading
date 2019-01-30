package implement;

/**
 * Created by Manish Tiwari on 1/29/2019.
 */
public class HeavyWorkRunnable implements Runnable{

    public void run() {
        //super.run();
        System.out.println("MyThread "+Thread.currentThread().getName()+" started.");
        try {
            System.out.println("inside HeavyWorkRunnable.run()");
            doSomething();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread "+Thread.currentThread().getName()+" executed.");
    }
    synchronized private void doSomething() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread.sleep(5000);
        long endTime = System.currentTimeMillis();
        System.out.println("Thread "+Thread.currentThread().getName()+" slept for "+((endTime-startTime)/1000)+" seconds");
    }
}


