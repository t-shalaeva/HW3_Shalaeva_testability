public class BonusMilesService {
    public static int calculate(int ticketCost) {
        int oneMileCost = 20;
        return ticketCost / oneMileCost;
    }
}
