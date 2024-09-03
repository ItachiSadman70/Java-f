
package Abstraction2;

 class A extends Marks {
     double marks1,marks2,marks3;
     A(double marks12,double marks34,double marks27){
         this.marks1 = marks12;
         this.marks2 = marks34;
         this.marks3 = marks27;
     }
     void getPercentage(){
         double totalMarks = marks1 + marks2 + marks3;
         double Percentage = (totalMarks/300)*100;
         System.out.println("The percentage of Student A is : " +Percentage);
     }
    
}
