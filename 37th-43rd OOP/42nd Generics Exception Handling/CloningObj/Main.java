
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        Human h1 = new Human(21, "Sujal");
        // Human h2 = new Human(h1); // Cloning h1 to h2 : lengthy

        Human h3 = (Human) h1.clone(); // Cloning using clone method : shorter

        System.out.println("Original Human: " + h1.name + ", Age: " + h1.age);
        // System.out.println("Cloned Human (h2): " + h2.name + ", Age: " + h2.age);
        System.out.println("Cloned Human (h3): " + h3.name + ", Age: " + h3.age);

        System.out.println(Arrays.toString(h3.arr));

    }

}
