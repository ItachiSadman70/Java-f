
package Polymorphism;

 class subClass extends superClass {
     int data1;
     int data2;
     void getData1(){
         this.data1 = super.data1;
         
     }
     void setdata2(int data2){
         this.data2 = data2;
     }
     void checkCondition(){
         System.out.println("Condition " + (data1==10&&data2==20) + "!");
         
     }
    
}
