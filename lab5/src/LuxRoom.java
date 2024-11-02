import java.util.UUID;

public class LuxRoom extends Room {
    int minRentPeriod;
    int maxRentPeriod;

    public LuxRoom(UUID id, int number, int capacity, double price, int minRentPeriod, int maxRentPeriod) {
        super(id, number, capacity, price);
        this.minRentPeriod = minRentPeriod;
        this.maxRentPeriod = maxRentPeriod;
    }

    @Override
    String getRoomType() {
        return "Lux room";
    }

    @Override
    public String toString() {
        return String.format("""
                        Room: room type: '%s'
                         room id: '%s'
                         room number: '%d'
                         room capacity: '%d'
                         room price: '%f'
                         room mi rent period: '%d'
                         room max rent period: '%d'""",
                this.getRoomType(), id.toString(), number, capacity, price, minRentPeriod, maxRentPeriod);
    }
}
