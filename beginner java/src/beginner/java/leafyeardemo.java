
package beginner.java;

import java.util.Scanner;


public class leafyeardemo {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Input a Year: ");
        int Year = in.nextInt();
        
        boolean x = (Year%4) == 0;
        boolean y = (Year%100)!= 0;
        boolean z = ((Year%100== 0) && (Year%400== 0));
        
        if(x && y||z)
        {
            System.out.println(Year + " is a Leap Year");
        }
        else
        {
            System.out.println(Year + " is not a Leap Year");
        }
        
    }
    
}
