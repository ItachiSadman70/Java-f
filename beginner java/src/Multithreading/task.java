
package Multithreading;

public class task implements Runnable {
     int sum;
     String threadName;
     task(String threadName){
         this.threadName = threadName;
     }
     
     @Override
     public void run(){
         sum = 0;
         for(int i=0;i<10;i++){
               sum+=i;
            System.out.println("Thread :"+threadName+" Value - "+sum);
         }
           System.out.println("Thread :"+threadName+" Sum - "+sum);
     }
    
}
