
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Hotel3 extends Hotel2 {
    ArrayList<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void printRooms() {
        System.out.printf("Available rooms:\n %s", rooms.stream().sorted(Comparator.comparingDouble(Room::getPrice)).map(Room::toString).collect(Collectors.joining(", ")));
    }

    public void saveToFile(ObjectOutputStream out) {
        rooms.forEach(room -> {
            try {
                out.writeObject(room);
            } catch (Exception e) {
                System.out.println("Error saving to file");
            }
        });
    }

    public void loadFromFile(ObjectInputStream in) {
        try {
            while (true) {
                Room room = (Room) in.readObject();
                rooms.add(room);
            }
        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (Exception e) {
            System.out.println("Error loading from file");
        }
    }
}