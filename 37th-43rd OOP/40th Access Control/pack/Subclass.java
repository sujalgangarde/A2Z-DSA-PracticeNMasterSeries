// import 40th Access Modifier.A;
public class Subclass extends A {

    public static void main(String[] args) {
        A a = new A(10, "sujal");
        a.name = "sujal"; // protected variable can be accessed in subclass
    }
}
