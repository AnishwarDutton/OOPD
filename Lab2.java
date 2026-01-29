public class Lab2 {


        public static void main(String[] args) {


            double roomTariffPrimitive = 2500.50;
            int numberOfDaysPrimitive = 3;
            double serviceChargePrimitive = 800.00;


            Double roomTariff = roomTariffPrimitive;
            Integer numberOfDays = numberOfDaysPrimitive;
            Double serviceCharge = serviceChargePrimitive;


            double roomCost = roomTariff * numberOfDays;
            double totalBill = roomCost + serviceCharge;


            System.out.println("----- HOTEL BILL -----");
            System.out.println("Room Tariff per Day : ₹" + roomTariff);
            System.out.println("Number of Days      : " + numberOfDays);
            System.out.println("Service Charges     : ₹" + serviceCharge);
            System.out.println();
            System.out.println("Total Bill Amount   : ₹" + totalBill);
        }


}
