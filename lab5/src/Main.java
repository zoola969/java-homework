import java.util.UUID;


// Implement the subject area:
//Hotel. Create a parent class "Room" (identifier, number, number of people, price) and child classes:
//        - "Standard room";
//        - "Semi-luxury room";
//        - "Luxury room" (min rental period, max rental period).
//Implement a class to store a list of rooms with a method for adding a room
//and a method for printing a list of rooms
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.printRooms();
        StandardRoom room1 = new StandardRoom(UUID.randomUUID(), 1, 2, 100);
        SemiLuxRoom room2 = new SemiLuxRoom(UUID.randomUUID(), 2, 3, 200);
        LuxRoom room3 = new LuxRoom(UUID.randomUUID(), 3, 4, 300, 10, 20);
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.printRooms();
    }
}


