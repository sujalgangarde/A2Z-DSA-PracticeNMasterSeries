// package Inheritance;

public class Box {
// as we put class as final methods in class auto became final
    private double v;
    double l;
    double w;
    double h;

    
    public Box() {
        super(); // Call the constructor of the parent class (Object)
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // cube
    public Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h) {
        System.out.println("Parent class constructor called");
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box oldBox) {
        this.l = oldBox.l;
        this.w = oldBox.w;
        this.h = oldBox.h;
    }

    static void greet(){
        System.out.println("from box");
    }

    public void displayInfo() {
        System.out.println("Length: " + l + " Width: " + w + " Height: " + h);
    }

}

