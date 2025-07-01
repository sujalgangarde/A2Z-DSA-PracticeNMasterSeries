public class Student implements Comparable<Student> {

    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Float.compare(this.marks, other.marks); // Compare by marks
        // return Float.compare(other.marks, this.marks); // For descending order
        // return this.rollNo - other.rollNo; // Compare by roll number
        // return other.rollNo - this.rollNo; // For  descending order

    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }


}
