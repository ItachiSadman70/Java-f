
package PractiseForLab;

import java.util.Scanner;
public class Conditional16 {
    public static void main(String[] args) {
        int i,j,n;
        
        System.out.print("Input numbers of rows : ");
        Scanner in = new Scanner (System.in);
        n = in.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
              
        }
        
        
    }
    
}
