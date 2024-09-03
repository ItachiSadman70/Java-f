
package PractiseForLab;

import java.util.Scanner;
public class Conditional14 {
    public static void main(String[] args) {
        int j,n;
        System.out.println("Input the Number(Table to be calculated) : ");
        {
            System.out.println("Input Number of terms : ");
            Scanner in = new Scanner (System.in);
            n = in.nextInt();
            
            System.out.println("\n");
            
            for(j=0;j<=n;j++)
                
             System.out.println(n+ " X " +j+ " = " +n*j);
          
                
           
        }
    }
    
}
