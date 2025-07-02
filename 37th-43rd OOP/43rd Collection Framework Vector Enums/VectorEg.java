import java.util.List;
import java.util.Vector;

public class VectorEg {

    public static void main(String[] args) {
        
        List<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println("Size of vector: " + v.size());
        System.out.println("Is vector empty? " + v.isEmpty());
        System.out.println("Element at index 1: " + v.get(1));
        System.out.println("Index of element 20: " + v.indexOf(20));
        System.out.println("Last index of element 20: " + v.lastIndexOf(20));
        System.out.println("Contains element 30? " + v.contains(30));
        System.out.println("Vector before removal: " + v);
        v.remove(1); // Remove element at index 1
        System.out.println("Vector after removal: " + v);
        System.out.println("Iterating through vector elements:");
        for (Integer i : v) {
            System.out.println(i);
        }

    }

}
