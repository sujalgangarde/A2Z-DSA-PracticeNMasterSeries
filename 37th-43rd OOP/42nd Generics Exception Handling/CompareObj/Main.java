
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(101, 85.5f);
        Student s2 = new Student(102, 90.0f);
        Student s3 = new Student(103, 85.5f);
        Student s4 = new Student(104, 90.0f);
        Student s5 = new Student(105, 75.0f);
        System.out.println(s1);
        System.out.println(s2);

        // if(s1 < s2) {
        //     System.out.println("s1 has less marks than s2");
        // } else if(s1 > s2) {
        //     System.out.println("s1 has more marks than s2");
        // } else {
        //     System.out.println("s1 and s2 have equal marks");
        // }
 
        if (s1.compareTo(s2) < 0) {
            System.out.println("s1 has less marks than s2");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("s1 has more marks than s2");
        } else {
            System.out.println("s1 and s2 have equal marks");
        }

        Student[] list = {s1, s2, s3, s4, s5};
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(list));

        


    }

}
