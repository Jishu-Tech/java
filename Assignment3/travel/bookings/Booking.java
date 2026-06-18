package travel.bookings;
import travel.flights.Flight;
import travel.hotels.Hotel;

public class Booking {
    
    public void bookFlight(Flight f) {
        System.out.println("--- Flight Booked ---");
        f.getDetails();
    }

    public void bookHotel(Hotel h) {
        System.out.println("--- Hotel Booked ---");
        h.getDetails();
    }
}