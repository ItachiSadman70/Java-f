
package PractiseForLab;

import java.util.Scanner;
public class Conditional20 {
    public static void main(String[] args) {
         
        int numberofRows;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner (System.in);
         numberofRows = in.nextInt();
         
        int number = 1;
        for(int row = 1; row<=numberofRows; row++)
        {
            for(int column = 1; column<=row; column++)
            {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(" ");
        }
    }
    
}
