public class DeveloperBonus implements BonusStrategy {
    @Override
    public double calculateBonus() {
        // Developer gets a fixed bonus of 10000
        return 10000;
    }
}