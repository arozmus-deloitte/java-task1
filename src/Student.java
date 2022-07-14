package src;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Student {
    private int studentId;
    private String firstName;
    private String secondName;


    public Student() {
    }

    public Student(int studentId, String firstName, String secondName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void displayInfo(String room, int hour)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println("----------------------------------------------------------");
        System.out.println("                 STUDENT "+this.getStudentId()+"            ");
        System.out.println("First Name           |  "+this.getFirstName()+"               |");
        System.out.println("Second Name          |  "+this.getSecondName()+"             |\n");
        System.out.println("Raport generated on " + dtf.format(now));
        System.out.println("Room number: " + room + "\n");


        System.out.println("----------------------------------------------------------");
    }

}
