package ecobike.model;

public class Bike {
    private short bikeId;
    private String category;
    private String bikeName;
    private double depositAmount;
    private double first30Min;
    private double next15MinEach;

    public Bike() {

    }

    public Bike(short bikeId, String category, String bikeName, double depositAmount, double first30Min, double next15MinEach) {
        this.bikeId = bikeId;
        this.category = category;
        this.bikeName = bikeName;
        this.depositAmount = depositAmount;
        this.first30Min = first30Min;
        this.next15MinEach = next15MinEach;
    }

    public void setBikeId(short bikeId) {
        this.bikeId = bikeId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setFirst30Min(double first30Min) {
        this.first30Min = first30Min;
    }

    public void setNext15MinEach(double next15MinEach) {
        this.next15MinEach = next15MinEach;
    }


    public short getBikeId() {
        return bikeId;
    }

    public String getCategory() {
        return category;
    }

    public String getBikeName() {
        return bikeName;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getFirst30Min() {
        return first30Min;
    }

    public double getNext15MinEach() {
        return next15MinEach;
    }
}
