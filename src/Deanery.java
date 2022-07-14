package src;

import java.util.Locale;
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
        int id = sc.nextInt();

        System.out.println("Enter the name: ");
        String name = sc.next();

        System.out.println("Enter the second name: ");
        String secondName = sc.next();

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
