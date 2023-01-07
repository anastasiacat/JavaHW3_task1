public class BonusMilesService {
    public int calculate(int cost) {
        int amountOfRubles = 20; //количество рублей для 1 бонусной мили
        int amountOfMiles = cost / amountOfRubles;
        return amountOfMiles;
    }
}
