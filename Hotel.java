class Hotel {
    private int availableRooms;

    public Hotel(int totalRooms) {
        this.availableRooms = totalRooms;
    }


    public synchronized void bookRoom(String customerName) {
        try {
            while (availableRooms == 0) {
                System.out.println(customerName + " waiting for a room...");
                wait();
            }

            availableRooms--;
            System.out.println(customerName + " booked a room. Available rooms: " + availableRooms);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public synchronized void releaseRoom(String customerName) {
        availableRooms++;
        System.out.println(customerName + " released a room. Available rooms: " + availableRooms);


    }
}
