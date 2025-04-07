// package Inheritance;

public class BoxPrice extends Box {

    double cost;

    public BoxPrice() {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice box) {
        super(box);
        this.cost = box.cost;
    }

    BoxPrice(double l, double w, double h, double cost) {
        super(l, w, h);
        this.cost = cost;
    }

}
