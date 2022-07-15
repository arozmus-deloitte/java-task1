package src;

import java.util.Objects;

public class PartTimeStudent extends Student {

    public PartTimeStudent(int studentId, String firstName, String secondName) {
        super(studentId, firstName, secondName);
    }

    public void serve(String room, int hour) throws Exception {
        room = room.toUpperCase();

        if (!Objects.equals(room, "C124") && !Objects.equals(room, "D124")) //TODO If tou use some specific strings - it is better to introduce the constants
            throw new Exception("This room is incorrect"); //TODO throwing a general Exception is a bad practice -> that's why I wrote a requirement to create a custom exception that says us a bit more about the cause

//        an example of the custom exception
//        public class RoomNotFoundException extends Exception {
//            private static final String MESSAGE = "ROOM WITH THIS NUMBER DOES NOT EXIST!";
//
//            public RoomNotFoundException() {
//                super(MESSAGE);
//            }
//        }

        //TODO comparing with objects.equals could be replaced with "C123".equals(room) as well
        //TODO Last thing is that we have some hardcoded logic here -> imagine we needed to add a new room that could serve the PartTimeStudents
        // then you would need to write an extra comparison of objects and it's hours
        // that is why a better way would be to introduce an enum/class that would represent a Room -> each room would have the info about
        // the opening and  closing hour in itself and it could contain a method verifying whether the hour is correct
        // then in this class you could simply keep a reference to a collection of Rooms that are suitable for a PartTime student
        // and let the Room enum handle the hours checking
        if (!(Objects.equals(room, "C124") && (hour >= 9 && hour <= 13)) && !(Objects.equals(room, "D124") && (hour >= 17 && hour <= 20)))
            throw new Exception("This hour is incorrect");

        displayInfo(room, hour);

    }
}
