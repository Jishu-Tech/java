package travel.flights;

public class Flight {
    String fNumber;
    String destination;
    double price;

    public Flight(String fNumber, String destination, double price) {
        this.fNumber = fNumber;
        this.destination = destination;
        this.price = price;
    }

    public void getDetails() {
        System.out.println("Flight Number: " + fNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Price: $" + price);
    }
}