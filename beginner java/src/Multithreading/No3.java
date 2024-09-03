
package Multithreading;


public class No3 {
    public static void main(String[] args) {
       
        Thread t1 = new Thread(new Greetings("Good Morning"));
        Thread t2 = new Thread(new Greetings("Welcome"));

        t1.start();
        t2.start();
    }
    }
    

