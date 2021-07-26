package GoodService;
// Status: DONE
// Issues: NONE

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import utilities.Time;

/**
 * Class dedicated to test the GoodService software.
 * @author João Borges, 1150475
 */
public class TestClass {
    
    /**
     * Tests to execute.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creating GoodService company
        GoodService goodServiceOriginal = new GoodService("GoodService Original", "227-845-091", 184723350);
        
        // Auxiliary variables
        Time openingHoursHostel1 = new Time(9, 0, 0);
        Time closingHoursHostel1 = new Time(20, 30, 0);
        Time openingHoursHostel2 = new Time(8, 30, 0);
        Time closingHoursHostel2 = new Time(21, 0, 0);
        
        // Creating specified objects
        Hotel hotel1 = new Hotel("Hotel 1", "Fake Street, 123", 258356927, false, Hotel.THREE_STARS, false, false);
        Hotel hotel2 = new Hotel("Hotel 2", "Fake Street, 456", 845098112, true, Hotel.FOUR_STARS, true, false);
        Hotel hotel3 = new Hotel("Hotel 3", "Fake Street, 789", 775231098, true, Hotel.FOUR_STARS, true, true);
        Hostel hostel1 = new Hostel("Hostel 1", "Up Street, 123", 645388092, true, openingHoursHostel1, closingHoursHostel1);
        Hostel hostel2 = new Hostel("Hostel 2", "Up Street, 456", 332889555, false, openingHoursHostel2, closingHoursHostel2);
        Restaurant restaurant1 = new Restaurant("Restaurant 1", "Down Street, 123", 777930081, 24, "Italian");
        Restaurant restaurant2 = new Restaurant("Restaurant 2", "Down Street, 456", 245590007, 8, "Portuguese");
        Restaurant restaurant3 = new Restaurant("Restaurant 3", "Down Street, 789", 991742664, 16, "Portuguese");
        POI poi1 = new POI("Pierre Statue", "Square Avenue, 123", "Classic");
        POI poi2 = new POI("Liberty Statue", "Square Avenue, 456", "Contemporary");
        POI poi3 = new POI("Downtown Square", "Up Hill, 789", "Square");
        POI poi4 = new POI("Spot Bar", "Up Hill, 790", "Other");
        
        // Adding objects to GoodServices Original list
        goodServiceOriginal.insertEntity(hotel1);
        goodServiceOriginal.insertEntity(hotel2);
        goodServiceOriginal.insertEntity(hotel3);
        goodServiceOriginal.insertEntity(hostel1);
        goodServiceOriginal.insertEntity(hostel2);
        goodServiceOriginal.insertEntity(restaurant1);
        goodServiceOriginal.insertEntity(restaurant2);
        goodServiceOriginal.insertEntity(restaurant3);
        goodServiceOriginal.insertEntity(poi1);
        goodServiceOriginal.insertEntity(poi2);
        goodServiceOriginal.insertEntity(poi3);
        goodServiceOriginal.insertEntity(poi4);

        // Exercises
        System.out.println("--- RUN 4 TASKS ---");
        specificTypePricePerPerson(Restaurant.TypeOfFood.PORTUGUESE.toString(), goodServiceOriginal.getRegisteredEntities());
        specificHotelWithTransferService(Hotel.FOUR_STARS, goodServiceOriginal.getRegisteredEntities());
        specificRatingPOI(POI.OK, goodServiceOriginal.getRegisteredEntities());
        organizedEntitiesList(goodServiceOriginal.getName(), goodServiceOriginal.getRegisteredEntities());
        System.out.println("\n--- COMPLETE ---");
    }
    
    // 1)
    private static void specificTypePricePerPerson(String typeOfFood, List<Entity> registeredEntities){
        boolean aux = false;
        System.out.println("\nAVERAGE PRICE PER PERSON FOR " + typeOfFood.toUpperCase() + " RESTAURANTS");
        for (int i = 0; i < registeredEntities.size(); i++) {
            if (registeredEntities.get(i) instanceof Restaurant && ((Restaurant)registeredEntities.get(i)).getCategory().toString().trim().equalsIgnoreCase(typeOfFood.trim())){
                System.out.println(registeredEntities.get(i).getName() + " - " + ((Restaurant)registeredEntities.get(i)).getAveragePricePerPerson() + "€");
                aux = true;
            }
        }
        if(aux == false){
            System.out.println("NO " + typeOfFood.toUpperCase() + " RESTAURANTS REGISTERED!");
        }
    }
    
    // 2)
    private static void specificHotelWithTransferService(String starRating, List<Entity> registeredEntities){
        boolean aux = false;
        System.out.println("\nHOTELS WITH " + starRating.toUpperCase() + " WITH TRANSFER SERVICE");
        for (int i = 0; i < registeredEntities.size(); i++) {
            if(registeredEntities.get(i) instanceof Hotel && ((Hotel)registeredEntities.get(i)).getCategory().trim().equalsIgnoreCase(starRating.trim()) && ((Hotel)registeredEntities.get(i)).validateTransferService() == true){
                System.out.println(registeredEntities.get(i).getName());
                aux = true;
            }
        }
        if(aux == false){
            System.out.println("NO " + starRating.toUpperCase() + " HOTELS WITH TRANSFER SERVICE!");
        }
    }
    
    // 3)
    private static void specificRatingPOI(int rating, List<Entity> registeredEntities){
        boolean aux = false;
        System.out.println("\nPOI RATED ON " +rating +" OR ABOVE");
        for (int i = 0; i < registeredEntities.size(); i++) {
            if(registeredEntities.get(i) instanceof POI && ((POI)registeredEntities.get(i)).getRating() >= rating){
                System.out.println(registeredEntities.get(i).getName() +" with a rating of" +registeredEntities.get(i).getRating() +".");
                aux = true;
            }
        }
        if(aux == false){
            System.out.println("THERE ARE NO POI RATED ON " +rating +" OR ABOVE!");
        }
    }
    
    // 4)
    private static void organizedEntitiesList(String companyName, List<Entity> registeredEntities){
        System.out.println("\nLIST OF ALL ENTITES ORGANIZED BASED ON CLASS AND LETTER");
        Comparator<Entity> orderByClassAndLetter = new Comparator<Entity>() {
            @Override
            public int compare(Entity o1, Entity o2) {
                String class1 = o1.getClass().getSimpleName();
                String class2 = o2.getClass().getSimpleName();
                if(class1.compareTo(class2) < 0){
                    return -1;
                } else if(class1.compareTo(class2) > 0){
                    return 1;
                } else {
                    String nameEntity1 = o1.getName();
                    String nameEntity2 = o2.getName();
                    if(nameEntity1.compareToIgnoreCase(nameEntity2) < 0){
                        return -1;
                    } else if(nameEntity1.compareToIgnoreCase(nameEntity2) > 0){
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        };
        Collections.sort(registeredEntities, orderByClassAndLetter);
        for (int i = 0; i < registeredEntities.size(); i++) {
            System.out.println(registeredEntities.get(i).getName() +" | " +registeredEntities.get(i).getAddress());
        }
    }
    
}