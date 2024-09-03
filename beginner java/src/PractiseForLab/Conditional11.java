
package PractiseForLab;

import java.util.Scanner;
public class Conditional11 {
    public static void main(String[] args) {
        
        int i,n,sum=0;
        {
            Scanner in = new Scanner (System.in);
            System.out.println("Input number : ");
            n = in.nextInt();
        }
        System.out.println("The first n natural numbers are :\n");
        
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            sum+=10;
        }
        System.out.println("The sum of natural numbers upto " +n+ " terms " +sum);
    }
    
}
