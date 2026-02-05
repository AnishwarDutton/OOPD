class BookingThread extends Thread {
    private Hotel hotel;
    private String customerName;

    public BookingThread(Hotel hotel, String customerName) {
        this.hotel = hotel;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        hotel.bookRoom(customerName);
    }
}
