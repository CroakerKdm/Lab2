package Hotel;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Lab2
 * @class IHotel
 * @since 08.04.2021 - 19.26
 **/

public interface IHotel {
    int getPriceForNight();

    int getPriceForSetAmount(int nightsToStay);
}
