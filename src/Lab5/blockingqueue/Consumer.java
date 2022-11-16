package Lab5.blockingqueue;
import java.util.concurrent.BlockingQueue;
/**
 * consumer takes from the integer
 *
 * @author Dennis Sutov
 * @version 15/11/2022
 */
public class Consumer implements Runnable {

    private final BlockingQueue<Integer> queue;

    @Override
    public void run() {

		 try {
             while (true) { // take();
                 process(queue.poll());
                 //Thread.sleep(4000);
             }
         } catch (InterruptedException e)
         {
             Thread.currentThread().interrupt();
         }
    }

    synchronized private void process(Integer take) throws InterruptedException {
        System.out.println("[Consumer] Take : " + take);
        Thread.sleep(100);
    }

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
}