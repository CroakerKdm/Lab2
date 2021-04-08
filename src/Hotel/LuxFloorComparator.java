package Hotel;

import java.util.Comparator;

public class LuxFloorComparator implements Comparator<Lux> {
    @Override
    public int compare(Lux lux1, Lux lux2) {
        if (lux1.getFloor() > lux2.getFloor()) return 1;
        else if (lux1.getFloor() < lux2.getFloor()) return -1;
        else return 0;

    }
}
