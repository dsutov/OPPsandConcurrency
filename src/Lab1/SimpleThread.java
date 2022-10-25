package Lab1;

/**
 * Simple Thread class extending the Thread class
 *
 * @author Dennis Sutov
 * @version 08/10/2022
 */

public class SimpleThread extends Thread
{

   public SimpleThread(String str)
   {
       super(str);
   }

    /**
     * Run method - runs when the thread starts
     */
    @Override
    public void run()
    {

       for(int i = 1; i <= 10; i++) {
           System.out.println(i + "" + getName());

           try {
               sleep((long)(Math.random() * 1000)); // 1000ms is 1second
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       System.out.println("DONE! " + getName());
    }

    public static void main(String[] args)
    {
       new SimpleThread("Dog").start();
       new SimpleThread("Cat").start();
    }
}
