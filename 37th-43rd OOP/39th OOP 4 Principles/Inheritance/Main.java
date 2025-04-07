// package Inheritance;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box();
        System.out.println(box1.l + " " + box1.w + " " + box1.h); // -1 -1 -1
        Box box2 = new Box(box1); // Copy constructor
        System.out.println(box2.l + " " + box2.w + " " + box2.h); // -1 -1 -1
        Box box3 = new Box(2, 3, 4); // Constructor with parameters
        System.out.println(box3.l + " " + box3.w + " " + box3.h); // 2.0 3.0 4.0

        BoxWeight boxWeight1 = new BoxWeight();
        System.out.println(boxWeight1.l + " " + boxWeight1.w + " " + boxWeight1.h + " " + boxWeight1.weight); // -1 -1 -1 -1
        BoxWeight boxWeight2 = new BoxWeight(2, 3, 4, 5); // Constructor with parameters
        System.out.println(boxWeight2.l + " " + boxWeight2.w + " " + boxWeight2.h + " " + boxWeight2.weight); // 2.0 3.0 4.0 5.0

        Box box5 = new BoxWeight(2, 3, 4, 5); // Upcasting
        // Upcasting means that we are creating a Box object that is actually a BoxWeight object.
        // This is possible because BoxWeight is a subclass of Box.
        // However, we can only access the methods and properties of the Box class.
        // We cannot access the methods and properties of the BoxWeight class.
        System.out.println(box5.l + " " + box5.w + " " + box5.h); // 2.0 3.0 4.0
        // System.out.println(box5.weight); // This will give an error because weight is not a property of Box class

        // BoxWeight boxWeight3 = new Box(2, 3, 4); // Downcasting
        // Downcasting means that we are creating a BoxWeight object that is actually a Box object.
        // problem : cant access and initialize weight because it is not a property of Box class
        // call is not going to child class constructor
        // This is not possible because Box is a superclass of BoxWeight.

        BoxPrice boxP = new BoxPrice();
        System.out.println(boxP.l + " " + boxP.w + " " + boxP.h + " " + boxP.cost); // -1 -1 -1 -1
        BoxPrice boxP2 = new BoxPrice(2, 3, 4, 5); // Constructor with parameters
        System.out.println(boxP2.l + " " + boxP2.w + " " + boxP2.h + " " + boxP2.cost); // 2.0 3.0 4.0 5.0

    }

}
