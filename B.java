package Lab1;

public class B {


    static class Room {

        protected int roomNumber;
        protected String roomType;
        protected double basePrice;

        public Room(int roomNumber, String roomType) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.basePrice = 0.0;
        }

        public Room(int roomNumber, String roomType, double basePrice) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.basePrice = basePrice;
        }

        public void displayRoomDetails() {
            System.out.println("Room Number: " + roomNumber);
            System.out.println("Room Type: " + roomType);
            System.out.println("Base Price: " + basePrice);
        }
    }

    // Derived class
    static class DeluxeRoom extends Room {

        private boolean freeWifi;
        private boolean complimentaryBreakfast;

        public DeluxeRoom(int roomNumber, String roomType,
                          boolean freeWifi, boolean complimentaryBreakfast) {
            super(roomNumber, roomType);
            this.freeWifi = freeWifi;
            this.complimentaryBreakfast = complimentaryBreakfast;
        }

        public DeluxeRoom(int roomNumber, String roomType, double basePrice,
                          boolean freeWifi, boolean complimentaryBreakfast) {
            super(roomNumber, roomType, basePrice);
            this.freeWifi = freeWifi;
            this.complimentaryBreakfast = complimentaryBreakfast;
        }

        public void displayDeluxeRoomDetails() {
            displayRoomDetails();
            System.out.println("Free Wi-Fi: " + freeWifi);
            System.out.println("Complimentary Breakfast: " + complimentaryBreakfast);
        }
    }


    public static void main(String[] args) {

        Room r1 = new Room(101, "Single");
        Room r2 = new Room(102, "Double", 2500);

        r1.displayRoomDetails();
        System.out.println();
        r2.displayRoomDetails();

        System.out.println();

        DeluxeRoom d1 = new DeluxeRoom(201, "Deluxe", true, true);
        DeluxeRoom d2 = new DeluxeRoom(202, "Premium Deluxe", 4500, true, true);

        d1.displayDeluxeRoomDetails();
        System.out.println();
        d2.displayDeluxeRoomDetails();
    }
}
