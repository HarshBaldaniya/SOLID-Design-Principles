public class DesignerBonus implements BonusStrategy {
    @Override
    public double calculateBonus() {
        // Designer gets a fixed bonus of 6000
        return 6000;
    }
}