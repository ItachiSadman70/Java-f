
package Abstraction2;

import java.util.Scanner;


public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Input the Marks of Student A : ");
        double marks1 = scan.nextDouble();
         double marks2 = scan.nextDouble();
          double marks3 = scan.nextDouble();
          A objA = new A(marks1,marks2,marks3);
          objA.getPercentage();
        
           System.out.println("Input the Marks of Student B : ");
         marks1 = scan.nextDouble();
          marks2 = scan.nextDouble();
           marks3 = scan.nextDouble();
          double marks4 = scan.nextDouble();
          B objB = new B(marks1,marks2,marks3,marks4);
          objB.getPercentage();
    }
    
}
