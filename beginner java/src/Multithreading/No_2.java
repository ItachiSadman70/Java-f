
package Multithreading;

public class No_2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new task("A"), "Thread A");
        Thread t2 = new Thread(new task("B"), "Thread B");
        Thread t3 = new Thread(new task("C"), "Thread C");

        t1.start();
        t2.start();
        t3.start();
    }
    
}
