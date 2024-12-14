
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Hotel2 extends Hotel {
    ArrayList<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void printRooms() {
        System.out.printf("Available rooms:\n %s", rooms.stream().sorted(Comparator.comparingDouble(Room::getPrice)).map(Room::toString).collect(Collectors.joining(", ")));
    }
}