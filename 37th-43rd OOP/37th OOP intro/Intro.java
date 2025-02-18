
class Student{
    int roll;
    String name;
    float marks = 90.4f;

    Student(){

        // this.roll = 0;
        // this.name = "Default";
        // this.marks = 100;

    // Calling another cunstructor
        this(13, "Default", 67); // refers to below constructor
    }

    // 'this' keyword : word to access variables for each object separately
    Student(int roll, String name, float marks) {
        // 'this' needed here bcz same variable_name like roll-roll
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.roll = other.roll;
    }

    void greet(){
        System.out.println("Hello "+name+" here"); // gives last updated
        System.out.println("Hello "+this.name+" here"); // access name of that perticular object who called it
    }

    void changeName(String NewName){
        name = NewName;
    }
    
}

public class Intro {
// *see whole code not just main method
    public static void main(String[] args) {
        
    // 'new' keyword : dynamically allocate memory and return reference variable to it
    // Constructor : Special type of funtion(if not created manually it created auto Default constructor), can have arguments
        Student s1 = new Student(12, "sujal", 89.9f);
        // s1.roll = 12;
        // s1.name = "Sujal";
        // s1.marks = 89.9f;
        System.out.println("roll: "+s1.roll+" name: "+s1.name+" marks: "+ s1.marks);
        s1.changeName("Don");
        s1.greet();

        Student s2 = new Student(s1);
        System.out.println(s2.name);

        Student s3 = new Student();
        System.out.println("roll: "+s3.roll+" name: "+s3.name+" marks: "+ s3.marks);

    // Objects_reference refering to same object and if modified by one it will reflect to another also (Not creating copy)
        Student one = new Student();
        Student two = one;
        one.name = "OneChanged";
        System.out.println(two.name);

// --> Wrapper.java
    }

}

