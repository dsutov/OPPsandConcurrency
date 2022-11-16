package Lab5.blockingqueue;

import java.util.concurrent.BlockingQueue;
/**
 * producer class puts into the integer
 *
 * @author Dennis Sutov
 * @version 15/11/2022
 */
public class Producer implements Runnable {

    private final BlockingQueue<Integer> queue;
    private int start;

    @Override
    public void run() {

        try {
            process();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    synchronized private void process() throws InterruptedException {

        // Put 20 ints into Queue and sleep for 100ms
        for(int i = start; i <= 20; i++) {
            System.out.println("[Producer] "+ Thread.currentThread().getName() + " Put : " + i);
            queue.put(i);
            System.out.println("Queue remaining capacity " + queue.remainingCapacity());
        }
        Thread.sleep(500);

    }

    public Producer(BlockingQueue<Integer> queue, int start) {
        this.queue = queue;
        this.start = start;
    }
}