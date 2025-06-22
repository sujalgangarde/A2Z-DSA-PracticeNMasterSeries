public abstract class Parent {

    abstract void abstractMethod(String str);

    int age;
    final String nam;

    public Parent(int age) {
        this.age = age;
        this.nam = "Don";
    }

    static void staticMethod() {
        System.out.println("Static method in Parent class");
    }

    

}

