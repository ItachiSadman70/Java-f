
package beginner.java;

import static java.time.Clock.system;
import java.util.*;
import java.util.Scanner;

public class CheckEvenorOdd {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.print("Input a number : ");
        int n = in.nextInt();
           if(n % 2 == 0) {
                System.out.println(1); 
               }
			else
           {
                System.out.println(0); 
              }
    }
    
}
