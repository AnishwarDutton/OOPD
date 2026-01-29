public class Lab2_B {
    public static void main(String[] args) {

        int days = 3;

        System.out.println("----- HOTEL ROOM TARIFF DETAILS -----");
        System.out.println("Days of Stay: " + days);
        System.out.println("------------------------------------");


        for (RoomType room : RoomType.values()) {

            double totalCost = room.calculateTotalCost(days);

            System.out.println("Room Type       : " + room);
            System.out.println("Base Tariff/day : ₹" + room.getBaseTariff());
            System.out.println("Total Cost      : ₹" + totalCost);
            System.out.println("------------------------------------");
        }
    }
}
