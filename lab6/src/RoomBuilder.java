import java.util.Scanner;
import java.util.UUID;

enum RoomType {
    STANDARD, SEMILUX, LUX,
}

public class RoomBuilder {
    Scanner scanner;

    public RoomBuilder(Scanner scanner) {
        this.scanner = scanner;
    }

    public Room buildRoom(RoomType roomType) {
        RoomDataParser parser = new RoomDataParser(scanner);
        return switch (roomType) {
            case STANDARD ->
                    new StandardRoom(UUID.randomUUID(), parser.parseRoomNumber(), parser.parseRoomCapacity(), parser.parseRoomPrice());
            case SEMILUX ->
                    new SemiLuxRoom(UUID.randomUUID(), parser.parseRoomNumber(), parser.parseRoomCapacity(), parser.parseRoomPrice());
            case LUX ->
                    new LuxRoom(UUID.randomUUID(), parser.parseRoomNumber(), parser.parseRoomCapacity(), parser.parseRoomPrice(), parser.parseMinRentPeriod(), parser.parseMaxRentPeriod());
        };
    }
}
