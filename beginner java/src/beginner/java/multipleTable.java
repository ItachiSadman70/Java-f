
package beginner.java;

import java.util.Scanner;


public class multipleTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input a Number: ");
        int num1 = in.nextInt();
        
        for(int i =0;i<10;i++)
        {
            System.out.println(num1+"x" +(i+1)+ " = " + (num1*(i+1)));
        }
    }

 
    
}
