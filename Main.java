import java.util.ArrayList;
import java.util.List;

class House {
    private String locality;
    private String city;
    private int squareFeet;
    private String type;
    private int rent;
    private int ownerId;

    public House(String locality, String city, int squareFeet, String type, int rent, int ownerId) {
        this.locality = locality;
        this.city = city;
        this.squareFeet = squareFeet;
        this.type = type;
        this.rent = rent;
        this.ownerId = ownerId;
    }

    public String getLocality() {
        return locality;
    }

    public String getCity() {
        return city;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public String getType() {
        return type;
    }

    public int getRent() {
        return rent;
    }

    public int getOwnerId() {
        return ownerId;
    }
}

class User {
    private int userId;
    private String name;
    private String email;
    private long mobile;
    private String aadhaar;

    public User(int userId, String name, String email, long mobile, String aadhaar) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.aadhaar = aadhaar;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getMobile() {
        return mobile;
    }

    public String getAadhaar() {
        return aadhaar;
    }
}

class HouseRentingPortal {
    private List<House> houses;
    private List<User> users;

    public HouseRentingPortal() {
        houses = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addHouse(House house) {
        houses.add(house);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayHousesForRent() {
        System.out.println("Houses available for rent:");
        for (House house : houses) {
            System.out.println("Locality: " + house.getLocality());
            System.out.println("City: " + house.getCity());
            System.out.println("Square Feet: " + house.getSquareFeet());
            System.out.println("Type: " + house.getType());
            System.out.println("Rent: " + house.getRent());
            System.out.println("Owner ID: " + house.getOwnerId());
            System.out.println();
        }
    }

    // Other methods for managing requests, approvals, etc.
    // Implement as per your requirements.
}

public class Main {
    public static void main(String[] args) {
        HouseRentingPortal portal = new HouseRentingPortal();

        // Add houses
        House house1 = new House("Kodambakkam", "Chennai", 798, "2BHK Rs. 6000/Month", 6000, 1);
        House house2 = new House("Goripalayam", "Madurai", 560, "1BHK Rs. 5500/Month", 5500, 1);
        House house3 = new House("Anna Nagar", "Chennai", 1200, "3BHK Rs. 15000/Month", 15000, 2);
        portal.addHouse(house1);
        portal.addHouse(house2);
        portal.addHouse(house3);

        // Add users
        User user1 = new User(1, "Lucifer", "lucifer@gmail.com", 9876543210L, "123412341234");
        User user2 = new User(2, "Peter Parker", "peterparker@gmail.com", 567856785678L, "1234567890");
        User user3 = new User(3, "Tony Stark", "tonystark@gmail.com", 345634563456L, "345634563456");
        portal.addUser(user1);
        portal.addUser(user2);
        portal.addUser(user3);

        // Display houses available for rent
        portal.displayHousesForRent();
    }
}