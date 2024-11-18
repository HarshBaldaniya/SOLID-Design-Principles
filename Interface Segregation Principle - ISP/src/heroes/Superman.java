package heroes;

import abilities.IFlyable;
import abilities.IStrength;

public class Superman implements IFlyable, IStrength {
    @Override
    public void fly() {
        System.out.println("Superman is flying!");
    }

    @Override
    public void liftHeavyObjects() {
        System.out.println("Superman is lifting a building!");
    }
}
