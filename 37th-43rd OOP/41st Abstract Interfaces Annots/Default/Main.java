
public class Main implements A, B {

    @Override
    public void greet() {
        System.out.println("Hello from Main!");
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.greet(); // Calls B's greet method
        main.fun();   // Calls A's default method
        A.staticFun(); // Calls A's static method

    }
}
