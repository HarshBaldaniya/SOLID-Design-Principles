import heroes.Superman;
import heroes.Aquaman;
import heroes.Flash;

public class Main {
    public static void main(String[] args) {
        Superman superman = new Superman();
        superman.fly();
        superman.liftHeavyObjects();

        Aquaman aquaman = new Aquaman();
        aquaman.swim();
        aquaman.liftHeavyObjects();

        Flash flash = new Flash();
        flash.liftHeavyObjects();
    }
}