

public class Nests {

    public interface nestedInterface {
        void greet();
    }

}

class A implements Nests.nestedInterface {

    @Override
    public void greet() {
        System.out.println("Hello from A!");
    }

}

