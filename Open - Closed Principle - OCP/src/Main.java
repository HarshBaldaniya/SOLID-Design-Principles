public class Main {
    public static void main(String[] args) {
        BonusCalculator calculator = new BonusCalculator();

        BonusStrategy managerBonus = new ManagerBonus();
        BonusStrategy developerBonus = new DeveloperBonus();

        System.out.println("Manager Bonus: RS " + calculator.calculate(managerBonus));
        System.out.println("Developer Bonus: RS " + calculator.calculate(developerBonus));

        // New employee types can be added without modifying existing code
        BonusStrategy designerBonus = new DesignerBonus();
        System.out.println("Designer Bonus: RS " + calculator.calculate(designerBonus));
    }
}