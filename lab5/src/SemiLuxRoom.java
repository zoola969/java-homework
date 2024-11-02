import java.util.UUID;

public class SemiLuxRoom extends Room {

    public SemiLuxRoom(UUID id, int number, int capacity, double price) {
        super(id, number, capacity, price);
    }

    @Override
    String getRoomType() {
        return "SemiLux room";
    }
}
