public class ManagerBonus implements BonusStrategy {
    @Override
    public double calculateBonus() {
        // Manager gets a fixed bonus of 20000
        return 20000;
    }
}