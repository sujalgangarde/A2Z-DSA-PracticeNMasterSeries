// package Polymorphism;

public class Overloading {

    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.println(obj.add(10, 20)); // Calls the first add method
        System.out.println(obj.add(10, 20, 30)); // Calls the second add method
        
    }

}
