package src;

import java.util.Objects;

public class PartTimeStudent extends Student{

    public PartTimeStudent(int studentId, String firstName, String secondName) {
        super(studentId, firstName, secondName);
    }

    public void serve(String room, int hour) throws Exception {

        if (!Objects.equals(room, "C124") || !room.equals("D124")) {
            System.out.println("correct room");
        } else {
            throw new Exception("This room is incorrect");
        }


        if ((Objects.equals(room, "C124") && (hour >= 9 && hour <= 13)) || (Objects.equals(room, "D124") && (hour >= 17 && hour <= 20))) {
            System.out.println("correct hour");
        } else {
            throw new Exception("This hour is incorrect");
        }

        displayInfo();

    }
}
