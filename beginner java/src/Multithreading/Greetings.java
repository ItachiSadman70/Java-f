
package Multithreading;


 class Greetings implements Runnable{
    
      String greetingsMsg;
    Greetings(String x) {
        greetingsMsg=x;
    }

    public void run() {
        while(true) {
            System.out.println(greetingsMsg);
        }
    }
}
