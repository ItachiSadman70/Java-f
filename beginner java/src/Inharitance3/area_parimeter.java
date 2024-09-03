
package Inharitance3;

import java.util.Scanner;


public class area_parimeter {
    public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);
         
         System.out.println("Enter length and breadth of arectangle : ");
         new rectangle(scan.nextFloat(),scan.nextFloat());
         
         rectangle.area();
         rectangle.perimeter();
         
         System.out.println("Enter side of square : ");
         new square(scan.nextFloat());
         
         square.area();
         square.perimeter();
         
         
         
    }
    
}
