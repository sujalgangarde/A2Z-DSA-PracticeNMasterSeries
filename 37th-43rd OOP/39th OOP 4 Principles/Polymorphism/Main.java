//package Polymorphism;

public class Main extends Object{

    int num;
    public Main(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Main{" +
                "num=" + num +
                '}';
    }

public static void main(String[] args) {
    Shapes s = new Shapes(); // Creating an object of the base class
    s.area(); // Calling the area method of the base class

    s = new Square(); // Creating an object of the derived class Square
    s.area(); // Calling the area method of the derived class Square

    s = new Circle(); // Creating an object of the derived class Circle
    s.area(); // Calling the area method of the derived class Circle

    s = new Triangle(); // Creating an object of the derived class Triangle
    s.area(); // Calling the area method of the derived class Triangle

    Circle c = new Circle(); // Creating an object of the Circle class
    c.area(); // Calling the area method of the Circle class

    Triangle t = new Triangle(); // Creating an object of the Triangle class
    t.area(); // Calling the area method of the Triangle class

    Square sq = new Square(); // Creating an object of the Square class
    sq.area(); // Calling the area method of the Square class


    // Polymorphism : The ability to take many forms. It is a feature of OOP that allows one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation. In Java, polymorphism is achieved through method overriding and method overloading.
    // 1. Compile-time polymorphism (Method Overloading): This is achieved by function overloading or operator overloading. The method to be called is determined at compile time. Same name but different parameters, different data types, or different number of parameters.
    // 2. Runtime polymorphism (Method Overriding): This is achieved by function overriding. The method to be called is determined at runtime. The method in the child class overrides the method in the parent class. The method in the child class has the same name, return type, and parameters as the method in the parent class.
    
    // 3. Dynamic method dispatch: This is a mechanism by which a call to an overridden method is resolved at runtime rather than compile-time. It is the most common use of polymorphism in Java. It allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
    // 4. Upcasting: This is the process of converting a subclass reference to a superclass reference. It allows a subclass object to be treated as an object of its superclass. This is done implicitly in Java. The subclass object can be assigned to a superclass reference variable.
    // 5. Downcasting: This is the process of converting a superclass reference to a subclass reference. It allows a superclass object to be treated as an object of its subclass. This is done explicitly in Java. The superclass reference can be cast to a subclass reference using the (subclass) operator. However, this can lead to a ClassCastException at runtime if the object being referenced is not an instance of the subclass.


    Main obj = new Main(14);
    System.out.println(obj); // toString() method is called implicitly

    

}
}
