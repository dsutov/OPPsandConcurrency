package Lab2;

/**
 * Simple Thread class extending Thread counting from 1 to 5
 *
 * @author Dennis Sutov
 * @version 11/10/2022
 */

public class SimpleThread2 extends Thread
{
    private int total;
    private String thread;
    private int delay;

    public SimpleThread2(int total, String thread, int delay)
    {
        this.total = total;
        this.thread = thread;
        this.delay = delay;
    }

    @Override
    public void run()
    {
        for(int i = 1; i <= 5; i++) {
            System.out.println(thread + i);

            try {
                //sleep((long)(Math.random() * 1000)); // 1000ms is 1second

                if(thread.equals("Two: ") && i == 3) {
                    throw new RuntimeException();
                }

                sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("DONE!");
    }


    public static void main(String[] args) {
        new SimpleThread2(10, "One: ", 1000).start();
        new SimpleThread2(10, "Two: ", 500).start();

    }
}
