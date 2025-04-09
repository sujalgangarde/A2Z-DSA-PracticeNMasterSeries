// package Inheritance;

public class BoxWeight extends Box{
    double weight; // weight of the box

    public BoxWeight() {
        this.weight = -1;
        // this.v = -1; can't access v because it is private in Box class
    }

    public BoxWeight(BoxWeight old) {
        super(old); // Call the copy constructor of the parent class (Box)
        this.weight = old.weight;
    }


    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); // Call the constructor of the parent class (Box)
        this.weight = weight;
        System.out.println(super.w); // Accessing the width of the parent class (Box)
    }

    // @Override
    static void greet(){ // can inherit but not override
        System.out.println("BoxWeight");
    }

}
