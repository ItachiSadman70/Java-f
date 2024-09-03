
package Inharitance;


public class CallingClass{
    public static void main(String[] args) {
        ParentClass objParent = new ParentClass();
        childClass objChild = new childClass();
        objParent.parentmethod();
        objChild.childMethod();
        objChild.parentmethod();
    }
}
/*
class ParentClass {
    public void parentmethod(){
        System.out.println("This is parent Class");
    }
    
}

class childClass extends ParentClass {
    public void childMethod(){
        System.out.println("This is child Class");
    }
    
}

*/