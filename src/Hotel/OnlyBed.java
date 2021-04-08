package Hotel;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Lab2
 * @class OnlyBed
 * @since 08.04.2021 - 19.29
 **/
public class OnlyBed implements IHotel {
    private boolean isAirConditioned;
    private boolean isWithWindows;
    private boolean isWithShower;
    private int numberOfCockroaches;

    public OnlyBed() {
    }

    public OnlyBed(boolean isAirConditioned, boolean isWithWindows, boolean isWithShower, int numberOfCockroaches) {
        this.isAirConditioned = isAirConditioned;
        this.isWithWindows = isWithWindows;
        this.isWithShower = isWithShower;
        this.numberOfCockroaches = numberOfCockroaches;
    }

    public boolean isAirConditioned() {
        return isAirConditioned;
    }

    public void setAirConditioned(boolean airConditioned) {
        isAirConditioned = airConditioned;
    }

    public boolean isWithWindows() {
        return isWithWindows;
    }

    public void setWithWindows(boolean withWindows) {
        isWithWindows = withWindows;
    }

    public boolean isWithShower() {
        return isWithShower;
    }

    public void setWithShower(boolean withShower) {
        isWithShower = withShower;
    }

    public int getNumberOfCockroaches() {
        return numberOfCockroaches;
    }

    public void setNumberOfCockroaches(int numberOfCockroaches) {
        this.numberOfCockroaches = numberOfCockroaches;
    }

    @Override
    public int getPriceForNight() {
        int price = 50 - this.getNumberOfCockroaches();
        if (this.isAirConditioned()) price += 25;
        if (this.isWithShower()) price += 10;
        if (this.isWithWindows()) price += 5;

        return price;
    }

    @Override
    public int getPriceForSetAmount(int nightsToStay) {
        return this.getPriceForNight() * nightsToStay;
    }

    @Override
    public String toString() {
        return "OnlyBed{" +
                "isAirConditioned=" + isAirConditioned +
                ", isWithWindows=" + isWithWindows +
                ", isWithShower=" + isWithShower +
                ", numberOfCockroaches=" + numberOfCockroaches +
                '}';
    }
}
