
package PractiseForLab;

import java.util.Scanner;


public class String1 {
     public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input a string: ");
        char[] letters = in.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
    
}
