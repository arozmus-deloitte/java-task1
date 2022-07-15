package src;

import java.util.Locale; //TODO useless import
import java.util.Objects;
import java.util.Scanner;

public class Deanery {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------DEANERY------------------");
        System.out.println("Enter the correct type of student: 'part' or 'full': ");
        String typeOfStudent = sc.nextLine().toLowerCase();

        System.out.println("Enter the room number: ");
        String room = sc.next();

        System.out.println("Enter the hour:");
        int hour = sc.nextInt();

        System.out.println("Enter the student ID: ");
        //TODO What I had in mind was to create the students objects first and then use some retrieval/searching of those students instead of creating a new one on-the-go
        //in here: "○ Create a few sample students: full time and part time with short and long names/surnames"
        // so at first -> you could create a few students and add them to a collection
        // and then only provide the student ID -> and search for this student in a collection
        // and because both types of students extend a Student class
        // and Java would now which implementation to use -> from PartTime student of FullTime student
        int id = sc.nextInt();

        System.out.println("Enter the name: ");
        String name = sc.next();

        System.out.println("Enter the second name: ");
        String secondName = sc.next();


        //TODO this whole block could be extracted to a separate method
        if (Objects.equals(typeOfStudent, "part")) {
            PartTimeStudent student = new PartTimeStudent(id,name, secondName);
            student.serve(room, hour);
        } else if (Objects.equals(typeOfStudent, "full")) {
            FullTimeStudent student = new FullTimeStudent(id, name, secondName);
            student.serve(room, hour);
        }
        else {
            System.out.println("Incorrect type of student");
        }
    }
}
