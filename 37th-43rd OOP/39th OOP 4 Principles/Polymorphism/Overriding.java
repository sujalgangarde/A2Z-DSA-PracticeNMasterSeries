// package Polymorphism;

public class Overriding {

    void greet(){
        System.out.println("Hello from Parent class");
    }

    public static void main(String[] args) {
        
        Overriding obj = new Overriding();
        obj.greet(); // Calls the greet method of Parent class

        Child childObj = new Child();
        childObj.greet(); // Calls the greet method of Child class

        Overriding polyObj = new Child();
        polyObj.greet(); // Calls the greet method of Child class due to polymorphism
        // The reference type is Parent class, but the object is of Child class


    }

}

class Child extends Overriding {
    @Override // This is an annotation, not mandatory but good practice
    // It indicates that this method is overriding a method in the parent class
    void greet(){
        System.out.println("Hello from Child class");
    }
}
