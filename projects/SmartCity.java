import java.util.ArrayList;
import java.util.Scanner;

 class City {
    ArrayList <String> attractions;
    ArrayList <String> restaurants;
    ArrayList <String> transportation;
    ArrayList <String> emergencycontact;

    public City(){
        attractions = new ArrayList<>();
        restaurants = new ArrayList<>();
        transportation = new ArrayList<>();
        emergencycontact = new ArrayList<>();

        addData();
    }

    public void addData(){
        attractions.add("Navki park");
        attractions.add("AMU univercity");
        attractions.add("Aminisha");


        restaurants.add("Food hub");
        restaurants.add("City center");
        restaurants.add("Sky Dec");
        restaurants.add("Top nosh");

        transportation.add("Bus");
        transportation.add("Metro");
        transportation.add("Flight");
        transportation.add("Train");

        emergencycontact.add("Police : 100");
        emergencycontact.add("Ambulance : 102");

  
    }
    
}

public class SmartCity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        City city = new City();

        System.out.println("Welcome to the our smart city");

        while (true) {
            System.out.println("Please choose an option");
            System.out.println("1. View Tourist Places");
            System.out.println("2. View Restaurants");
            System.out.println("3. View Transporatins Services");
            System.out.println("4. View Emegency controls");
            System.out.println("5. Exit");


             if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next(); // consume invalid token
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Tourist places:");
                    System.out.println(city.attractions);
                    break;


                  case 2:
                    System.out.println("Resutrants :");
                    System.out.println(city.restaurants);
                    break;


                  case 3:
                    System.out.println("Transport Services:");
                    System.out.println(city.transportation);
                    break;

                  case 4:
                    System.out.println("Emergency Services:");
                    System.out.println(city.emergencycontact);
                    break;


                case 5:
                     System.out.println("Thank you for visiting");
                     sc.close();
                     return;

            
                default:
                     System.out.println("Invalid choice");
            }



            


            
        }

        
    }

    
}
