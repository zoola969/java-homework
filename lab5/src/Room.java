import java.util.UUID;

abstract public class Room {
    UUID id;
    int number;
    int capacity;
    double price;

    public Room(UUID id, int number, int capacity, double price) {
        this.id = id;
        this.number = number;
        this.capacity = capacity;
        this.price = price;
    }

    abstract String getRoomType();

    public String toString() {
        return String.format("""
                        Room: room type: '%s'
                        room id: '%s'
                        room number: '%d'
                        room capacity: '%d'
                        room price: '%f'""",
                this.getRoomType(), id.toString(), number, capacity, price);
    }
}
