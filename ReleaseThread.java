class ReleaseThread extends Thread {
    private Hotel hotel;
    private String customerName;

    public ReleaseThread(Hotel hotel, String customerName) {
        this.hotel = hotel;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000); // simulate stay duration
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hotel.releaseRoom(customerName);
    }
}
