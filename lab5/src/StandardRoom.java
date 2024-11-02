import java.util.UUID;

public class StandardRoom extends Room {
    public StandardRoom(UUID id, int number, int capacity, double price) {
        super(id, number, capacity, price);
    }

    @Override
    String getRoomType() {
        return "Standard room";
    }
}
