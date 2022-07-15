package src;

import java.util.Objects;

public class FullTimeStudent extends Student {

    public FullTimeStudent(int studentId, String firstName, String secondName) {
        super(studentId, firstName, secondName);
    }

    //TODO same as in the PartTimeStudent class
    // + as you can see there is some duplication of a code in here -> it would be better to keep the verification logic in the Student class
    // and only keep the proper Rooms collection in the child classes
    public void serve(String room, int hour) throws Exception {
        room = room.toUpperCase();

        if (!Objects.equals(room, "A123") && !Objects.equals(room, "B123"))
            throw new Exception("This room is incorrect");


        if (!(Objects.equals(room, "A123") && (hour >= 8 && hour <= 16)) && !(Objects.equals(room, "B123") && (hour >= 9 && hour <= 17)))
            throw new Exception("This hour is incorrect");

        displayInfo(room, hour);

    }
}
