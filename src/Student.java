package src; //TODO it could be better to create a package with a meaning name

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Student { //TODO if you extend this class, it could be abstract - because we don't want to create Students that are neither PartTime nor FullTime
    private int studentId;
    private String firstName;
    private String secondName;


    public Student() { //TODO This one is useless here
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

    public void displayInfo(String room, int hour) //TODO that method should not be public -> because in this structure we could call the displayInfo on every student without verifying whether a room number and hour are correct
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"); //TODO try not to use meaningless names of the objects like dtf -> it is harder to understand the code when they are mentioned later
        LocalDateTime now = LocalDateTime.now();

        //TODO instead of so many System outs, it would be better to create a one String e.g. with StringBuilder and then print it out -> that way you would be sure that if there is some error during the displaying, you wouldn't get the partial report printed to console

        System.out.println("----------------------------------------------------------");
        System.out.println("                 STUDENT "+this.getStudentId()+"            ");
        System.out.println("First Name           |  "+this.getFirstName()+"               |");
        //TODO when you write the spaces like that -> the report would not be properly formatted, when a first name and last name have different lengths
        //TODO it is better to use the String format with the %<number>s fixed length to set the maximum length of a string that would be filled with spaces -> this way the table would look like a table not just some random "|" characters
        System.out.println("Second Name          |  "+this.getSecondName()+"             |\n");
        System.out.println("Raport generated on " + dtf.format(now));
        System.out.println("Room number: " + room + "\n");


        System.out.println("----------------------------------------------------------");
    }

}
