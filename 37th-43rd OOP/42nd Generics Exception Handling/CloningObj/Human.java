
public class Human implements Cloneable {

    int age;
    String name;
    int[] arr;

    // Default constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 1}; // Example array initialization
    }

    // public Human(Human other){
    //     this.age = other.age;
    //     this.name = other.name;
    // }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
