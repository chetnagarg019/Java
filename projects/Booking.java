import java.util.*;

class Hotel{
    String type, status;
    int roomNo;
    double price;

    //constructor
    Hotel(String type,String status,int roomNo,double price){
        this.type = type;
        this.status = status;
        this.price = price;
        this.roomNo = roomNo;
    }

    public String toString(){
        return roomNo + "|" + type + "|" + price + "|" + status; 
    }

}

// Booking logic
class BookedLogic {
    ArrayList<Hotel> rooms = new ArrayList<>();
    ArrayList<Hotel> bookedRooms = new ArrayList<>(); 

    void initializeRooms(){
    rooms.add(new Hotel("Single", "Available", 101, 1000));
    rooms.add(new Hotel("Double", "Available", 102, 1500));
    rooms.add(new Hotel("Suite", "Booked", 103, 3000));
    rooms.add(new Hotel("Single", "Available", 104, 1200));
    rooms.add(new Hotel("Double", "Booked", 105, 1800));
    rooms.add(new Hotel("Suite", "Available", 106, 3500));
    rooms.add(new Hotel("Deluxe", "Booked", 107, 4000));
    rooms.add(new Hotel("Deluxe", "Available", 108, 4200));
    rooms.add(new Hotel("Presidential", "Booked", 109, 6000));
    rooms.add(new Hotel("Presidential", "Available", 110, 6500));
    }

    // view avaialable rooms 
    void viewAvailableRooms() {
        System.out.println("Available Rooms:");
        boolean anyAvailable = false;
        for(Hotel room : rooms){
              if(room.status.equalsIgnoreCase("Available")){
                System.out.println(room);
                anyAvailable = true;
              }
        }

        if(!anyAvailable){
            System.out.println("No room available");
        }
    }

    //booked room 
    void bookRoom(Scanner sc){
        viewAvailableRooms();
        System.out.println("Enter room no to book: ");
        int roomNo = sc.nextInt();
        boolean found = false;

        for(Hotel room : rooms){

            if(room.roomNo == roomNo && room.status.equalsIgnoreCase("Available")){
                room.status = "Booked";
                bookedRooms.add(room);
                System.out.println("Room" + " " +  roomNo + " " + "booked succesfully");
                found = true;
                break;
            }

        }

        if(!found){
            System.out.println("Room not Available");
        }

    }

    void cancelBooking(Scanner sc) {
        System.out.println("Enter room no to cancel booking:");
        int roomNo = sc.nextInt();
        boolean found = false;

        for(Hotel room : bookedRooms){
            if(room.roomNo == roomNo){
                room.status = "Available";
                bookedRooms.remove(room);
                System.out.println("Your cancelation procees is succesfuuly");
                found = true;
                break;
            }
        }

          if (!found) {
            System.out.println("No such booking found.");
        }
    }

    // admin panel 
    void adminPanel(Scanner sc) {
        System.out.println("Admin panel...");
        System.out.println("1. Add room");
        System.out.println("2. Remove room");
        int choice = sc.nextInt();

          if (choice == 1) {
            System.out.print("Enter room number: ");
            int roomNo = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter room type: ");
            String type = sc.nextLine();
            System.out.print("Enter room price: ");
            double price = sc.nextDouble();
            rooms.add(new Hotel(type, "Available", roomNo, price));
            System.out.println("Room added successfully!");
        } else if (choice == 2) {
            System.out.print("Enter room number to remove: ");
            int roomNo = sc.nextInt();
            boolean removed = rooms.removeIf(r -> r.roomNo == roomNo);
            if (removed) {
                System.out.println("Room removed successfully!");
            } else {
                System.out.println("Room not found.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

    }

}

public class Booking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookedLogic logic = new BookedLogic();
        logic.initializeRooms();

        while (true) {
            System.out.println("\n===== Welcome to Top-Nosh Hotel =====");
            System.out.println("1. View available rooms");
            System.out.println("2. Book a room");
            System.out.println("3. Cancel booking");
            System.out.println("4. Admin panel");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    logic.viewAvailableRooms();
                    break;

                case 2 : 
                   logic.bookRoom(sc);
                   break;

                case 3 :
                    logic.cancelBooking(sc);
                    break;

                case 4  : 
                   logic.adminPanel(sc);
                   break;

                case 5 : 
                   System.out.println("Thank you for visiting");
                   System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again");
            }

            
        }
    }
}
