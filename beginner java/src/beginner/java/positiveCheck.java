
package beginner.java;

import java.util.Scanner;



public class positiveCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Input a number : ");
        int input = in.nextInt();
        if(input>0)
        { 
            System.out.println("The number is positive");
        }
        else if(input<0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is Zero");
        }
        
    }
}
                   
        

            
    
    

