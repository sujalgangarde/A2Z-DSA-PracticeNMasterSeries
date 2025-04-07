public class Main {

    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);
        Box b2 = new Box(10);
        Box b3 = new Box(b1);
        b1.information();
        b2.information();
        b3.information();
    }
}
