package travel.hotels;

public class Hotel {
    String h_Name;
    String h_loc;
    double price;

    public Hotel(String h_Name, String h_loc, double price) {
        this.h_Name = h_Name;
        this.h_loc = h_loc;
        this.price = price;
    }

    public void getDetails() {
        System.out.println("Hotel Name: " + h_Name);
        System.out.println("Location: " + h_loc);
        System.out.println("Price: $" + price + " per night");
    }
}