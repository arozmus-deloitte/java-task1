package src;

public class Deanery {
    public static void main(String[] args) throws Exception {
        FullTimeStudent fullTimeStudent = new FullTimeStudent(252954,"ola","rozmus");

        fullTimeStudent.serve("A123",20);
        System.out.println("hello");
    }
}
