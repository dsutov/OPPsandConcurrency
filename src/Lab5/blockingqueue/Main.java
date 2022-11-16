package Lab5.blockingqueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * main class creates and starts threads
 *
 * @author Dennis Sutov
 * @version 15/11/2022
 */
public class Main implements Runnable{

    public static void main(String[] args) {
    	
    	// Create a new LinkedBlockingQueue size 10
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(4);
        
        //Start Producer and Consumer threads

        Producer p1 = new Producer(queue, 10);
        //Producer p2 = new Producer(queue, 10);
        //Producer p3 = new Producer(queue, 10);
        Consumer c1 = new Consumer(queue);

        new Thread(p1, "p1").start();
        //new Thread(p2, "p2").start();
        //new Thread(p3, "p3").start();
        new Thread(c1, "c1").start();



    }

    @Override
    public void run() {

    }
}