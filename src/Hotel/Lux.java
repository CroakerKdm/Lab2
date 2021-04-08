package Hotel;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Lab2
 * @class Lux
 * @since 08.04.2021 - 19.30
 **/

public class Lux implements IHotel {
    private static final int TOPFLOOR = 15;

    private int numberOfBeds;
    private boolean isEquippedWithPool;
    private int floor;
    private int numberOfBathrooms;
    private boolean isEquippedWithPersonalMaid;

    public Lux() {
    }

    public Lux(int numberOfBeds, boolean isEquippedWithPool, int floor, int numberOfBathrooms,
               boolean isEquippedWithPersonalMaid) {
        this.numberOfBeds = numberOfBeds;
        this.isEquippedWithPool = isEquippedWithPool;
        this.floor = floor;
        this.numberOfBathrooms = numberOfBathrooms;
        this.isEquippedWithPersonalMaid = isEquippedWithPersonalMaid;
    }

    public static int getTOPFLOOR() {
        return TOPFLOOR;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isEquippedWithPool() {
        return isEquippedWithPool;
    }

    public void setEquippedWithPool(boolean equippedWithPool) {
        isEquippedWithPool = equippedWithPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public boolean isEquippedWithPersonalMaid() {
        return isEquippedWithPersonalMaid;
    }

    public void setEquippedWithPersonalMaid(boolean equippedWithPersonalMaid) {
        isEquippedWithPersonalMaid = equippedWithPersonalMaid;
    }

    @Override
    public int getPriceForNight() {
        int price = this.getNumberOfBeds() * 400 + getNumberOfBathrooms() * 200;
        if (this.getFloor() == TOPFLOOR) {
            price += 20000;
        } else {
            price += this.getFloor() * 100;
        }
        if (this.isEquippedWithPersonalMaid()) price += 5000;
        if (this.isEquippedWithPool()) price += 3000;

        return price;
    }

    @Override
    public int getPriceForSetAmount(int nightsToStay) {
        return this.getPriceForNight() * nightsToStay;
    }

    @Override
    public String toString() {
        return "Lux{" +
                "numberOfBeds=" + numberOfBeds +
                ", isEquippedWithPool=" + isEquippedWithPool +
                ", floor=" + floor +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", isEquippedWithPersonalMaid=" + isEquippedWithPersonalMaid +
                '}';
    }
}