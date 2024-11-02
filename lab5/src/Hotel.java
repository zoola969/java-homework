
import java.util.ArrayList;

class Hotel {
    ArrayList<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void printRooms() {
        System.out.printf("Available rooms: %s\n", this.rooms.toString());
    }
}