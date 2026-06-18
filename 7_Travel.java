import travel.flights.Flight;
import travel.hotels.Hotel;
import travel.bookings.Booking;

public class Travel {
    public static void main(String args[]) {
        // 1. Create objects
        Flight f1 = new Flight("AI202", "Paris", 650.0);
        Hotel h1 = new Hotel("Le Ritz", "Paris", 300.0);
        Booking booking = new Booking();

        // 2. Book a flight and a hotel
        System.out.println("=== Booking Details ===");
        booking.bookFlight(f1);
        System.out.println();
        booking.bookHotel(h1);
    }
}