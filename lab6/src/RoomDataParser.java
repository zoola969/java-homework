import java.util.Scanner;

public class RoomDataParser {
    Scanner scanner;

    public RoomDataParser(Scanner scanner) {
        this.scanner = scanner;
    }

    public int parseRoomNumber() {
        while (true) {
            System.out.println("Enter room number:");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public  int parseRoomCapacity() {
        while (true) {
            System.out.println("Enter room capacity:");
            if (scanner.hasNextInt()) {
                int capacity = scanner.nextInt();
                if (capacity > 0) {
                    return capacity;
                } else {
                    System.out.println("Invalid input. Capacity must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public  double parseRoomPrice() {
        while (true) {
            System.out.println("Enter room price:");
            if (scanner.hasNextDouble()) {
                double price = scanner.nextDouble();
                if (price > 0) {
                    return price;
                } else {
                    System.out.println("Invalid input. Price must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private int parseRentPeriod() {
        while (true) {
            if (scanner.hasNextInt()) {
                int rent_period = scanner.nextInt();
                if (rent_period > 0) {
                    return rent_period;
                } else {
                    System.out.println("Invalid input. Rent period must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public int parseMaxRentPeriod() {
        System.out.println("Enter max rent period");
        return parseRentPeriod();
    }

    public int parseMinRentPeriod() {
        System.out.println("Enter min rent period:");
        return parseRentPeriod();
    }
}
