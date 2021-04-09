import Hotel.*;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Lab2
 * @class Main
 * @since 07.04.2021 - 18.19
 **/

public class Main {
    public static void main(String[] args) {
        ArrayList<Lux> luxes = new ArrayList<>();
        ArrayList<OnlyBed> rooms = new ArrayList<>();

        luxes.add(new Lux(5, true, 15, 3, true));
        luxes.add(new Lux(2, false, 13, 2, true));
        luxes.add(new Lux(2, true, 14, 1, false));
        luxes.add(new Lux(1, false, 10, 1, false));
        luxes.add(new Lux(4, true, 12, 2, true));

        rooms.add(new OnlyBed(true, true, true, 0));
        rooms.add(new OnlyBed(false, false, false, 20));
        rooms.add(new OnlyBed(true, true, true, 5));
        rooms.add(new OnlyBed(false, true, false, 10));
        rooms.add(new OnlyBed(false, true, true, 15));

        System.out.println("All luxes with price lower than 20 000:");//1
        luxes.stream().filter(lux -> lux.getPriceForNight() < 20_000).forEach(System.out::println);

        System.out.println("\nHighest lux price is for room: " + luxes.stream().max(Comparator.comparing(Lux::getPriceForNight)));//2

        System.out.println("\nLuxes sorted by floor:");//3
        luxes.stream().sorted(new LuxFloorComparator()).forEach(System.out::println);

        System.out.println("\nAverage lux price = " + luxes.stream().mapToInt(Lux::getPriceForNight).average());//4

        System.out.println("\nPrices for the rooms with acceptable living conditions:");//5
        rooms.stream().filter(room -> room.getNumberOfCockroaches() < 10 && room.isWithWindows() && room.isWithShower()
                && room.isAirConditioned()).map(OnlyBed::getPriceForNight).forEach(System.out::println);

        System.out.println("\nRooms with no insects:");//6
        rooms.stream().filter(room -> room.getNumberOfCockroaches() == 0).forEach(System.out::println);
    }
}

/*      All luxes with price lower than 20 000:
        Lux{numberOfBeds=2, isEquippedWithPool=false, floor=13, numberOfBathrooms=2, isEquippedWithPersonalMaid=true}
        Lux{numberOfBeds=2, isEquippedWithPool=true, floor=14, numberOfBathrooms=1, isEquippedWithPersonalMaid=false}
        Lux{numberOfBeds=1, isEquippedWithPool=false, floor=10, numberOfBathrooms=1, isEquippedWithPersonalMaid=false}
        Lux{numberOfBeds=4, isEquippedWithPool=true, floor=12, numberOfBathrooms=2, isEquippedWithPersonalMaid=true}

        Highest lux price is for room: Optional[Lux{numberOfBeds=5, isEquippedWithPool=true, floor=15, numberOfBathrooms=3, isEquippedWithPersonalMaid=true}]

        Luxes sorted by floor:
        Lux{numberOfBeds=1, isEquippedWithPool=false, floor=10, numberOfBathrooms=1, isEquippedWithPersonalMaid=false}
        Lux{numberOfBeds=4, isEquippedWithPool=true, floor=12, numberOfBathrooms=2, isEquippedWithPersonalMaid=true}
        Lux{numberOfBeds=2, isEquippedWithPool=false, floor=13, numberOfBathrooms=2, isEquippedWithPersonalMaid=true}
        Lux{numberOfBeds=2, isEquippedWithPool=true, floor=14, numberOfBathrooms=1, isEquippedWithPersonalMaid=false}
        Lux{numberOfBeds=5, isEquippedWithPool=true, floor=15, numberOfBathrooms=3, isEquippedWithPersonalMaid=true}

        Average lux price = OptionalDouble[11260.0]

        Prices for the rooms with acceptable living conditions:
        90
        85

        Rooms with no insects:
        OnlyBed{isAirConditioned=true, isWithWindows=true, isWithShower=true, numberOfCockroaches=0}
*/


