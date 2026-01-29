public class Lab3 {
    static class HotelService implements Runnable {
        private String serviceName;
        private String roomNumber;

        HotelService(String serviceName, String roomNumber) {
            this.serviceName = serviceName;
            this.roomNumber = roomNumber;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(serviceName + " for " + roomNumber +
                        " - Step " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(serviceName + " interrupted");
                }
            }
            System.out.println(serviceName + " for " + roomNumber + " completed.\n");
        }
    }



        public static void main(String[] args) {
            Thread t1 = new Thread(new HotelService("Room Cleaning", "Room 101"));
            Thread t2 = new Thread(new HotelService("Food Delivery", "Room 102"));
            Thread t3 = new Thread(new HotelService("Maintenance", "Room 103"));

            t1.start();
            t2.start();
            t3.start();
        }


}


