
package Abstraction2;


 class B extends Marks{
       double marks1,marks2,marks3,marks4;
     B(double marks12,double marks34,double marks27,double marks56){
         this.marks1 = marks12;
         this.marks2 = marks34;
         this.marks3 = marks27;
         this.marks4 = marks56;
     }
     void getPercentage(){
         double totalMarks = marks1 + marks2 + marks3+marks4;
         double Percentage = (totalMarks/400)*100;
         System.out.println("The percentage of Student B is : " +Percentage);
     }
    
    
}
