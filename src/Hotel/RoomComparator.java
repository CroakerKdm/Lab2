package Hotel;

import java.util.Comparator;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Lab2
 * @class RoomComparator
 * @since 08.04.2021 - 22.17
 **/
public class RoomComparator implements Comparator<OnlyBed> {
    @Override
    public int compare(OnlyBed room1, OnlyBed room2) {
        if (room1.getNumberOfCockroaches() > room2.getNumberOfCockroaches()) return 1;
        else if (room1.getNumberOfCockroaches() < room2.getNumberOfCockroaches()) return -1;
        else return 0;

    }
}
