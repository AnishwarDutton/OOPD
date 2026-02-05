public class HotelRoomManagement {
    public static void main(String[] args) {

        Hotel hotel = new Hotel(2); // Only 2 rooms

        BookingThread c1 = new BookingThread(hotel, "Customer 1");
        BookingThread c2 = new BookingThread(hotel, "Customer 2");
        BookingThread c3 = new BookingThread(hotel, "Customer 3");

        ReleaseThread r1 = new ReleaseThread(hotel, "Customer 1");

        c1.start();
        c2.start();
        c3.start();

        r1.start();
    }
}
