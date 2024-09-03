
package Inharitance3;

 class rectangle {
     static float length;
     static float breadth;
     
     public rectangle (float l,float b){
         length = l;
         breadth = b;
                 
     }
     public static void area(){
         System.out.println("Area of rectangle is : " +(length*breadth));
     }
     public static void perimeter(){
         System.out.println("Perimeter of rectangle is : " + (2*(length+breadth)));
     }
    
}
