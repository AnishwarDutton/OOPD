public enum RoomType {
    STANDARD(2000),
    DELUXE(3500),
    SUITE(6000);

    private double baseTariff;

    // Enum constructor
    RoomType(double baseTariff) {
        this.baseTariff = baseTariff;
    }

    // Method to get base tariff
    public double getBaseTariff() {
        return baseTariff;
    }

    // Method to calculate total cost
    public double calculateTotalCost(int days) {
        return baseTariff * days;
    }
}
