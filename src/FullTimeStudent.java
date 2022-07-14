package src;

import java.util.Objects;

public class FullTimeStudent extends Student {

    public FullTimeStudent(int studentId, String firstName, String secondName) {
        super(studentId, firstName, secondName);
    }

    public void serve(String room, int hour) throws Exception {

        if (!Objects.equals(room, "A123") || !room.equals("B123")) {
            System.out.println("correct room");
        } else {
            throw new Exception("This room is incorrect");
        }


        if ((Objects.equals(room, "A123") && (hour >= 8 && hour <= 16)) || (Objects.equals(room, "B123") && (hour >= 9 && hour <= 17))) {
            System.out.println("correct hour");
        } else {
            throw new Exception("This hour is incorrect");
        }

        displayInfo();

    }
}
