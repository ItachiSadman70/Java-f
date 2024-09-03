
package Inharitance3;


 class square extends rectangle {
     static float side;
     
     public square (float s){
         super(s,s);
         side = s;
     }
     public static void area(){
         System.out.println("Area of square is : " +(side*side));
     }
     public static void perimeter(){
         System.out.println("Perimeter of square is : " + (4*side));
     }
    
}
