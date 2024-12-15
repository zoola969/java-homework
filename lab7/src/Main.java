import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel3 hotel = new Hotel3();
        while (true) {
            handleOption(scanner, hotel);
        }
    }

    private static void handleOption(Scanner scanner, Hotel3 hotel) {
        printMenu();
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid option");
            return;
        }
        switch (scanner.nextInt()) {
            case 1:
                hotel.addRoom(addRoom(scanner));
                return;
            case 2:
                hotel.printRooms();
                return;
            case 3:
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("rooms.txt"))){
                    hotel.saveToFile(oos);
                } catch (IOException e) {
                    System.out.println("Error saving to file");
                }
                return;
            case 4:
                try (ObjectInputStream ois = new ObjectInputStream( new FileInputStream("rooms.txt"))){
                    hotel.loadFromFile(ois);
                } catch (IOException e) {
                    System.out.println("Error loading from file");
                }
                    return;
            case 5:
                System.out.println("Exit");
                System.exit(0);
                return;
            default:
                System.out.println("Invalid option");
        }
    }

    private static Room addRoom(Scanner scanner) {
        return new RoomBuilder(scanner).buildRoom(getRoomType(scanner));
    }

    private static RoomType getRoomType(Scanner scanner) {
        System.out.println("Enter room type:");
        System.out.println("1. Standard room");
        System.out.println("2. Semi-luxury room");
        System.out.println("3. Luxury room");
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
            int room_type = scanner.nextInt();
            switch (room_type) {
                case 1:
                    return RoomType.STANDARD;
                case 2:
                    return RoomType.SEMILUX;
                case 3:
                    return RoomType.LUX;
                default:
                    System.out.println("Invalid room type");
            }

        }
    }

    private static void printMenu() {
        System.out.println("--------------------");
        System.out.println("Choose an option:");
        System.out.println("1. Add room");
        System.out.println("2. Print rooms");
        System.out.println("3. Save rooms to file");
        System.out.println("4. Load rooms from file");
        System.out.println("5. Exit");
        System.out.println("--------------------");
    }
}


