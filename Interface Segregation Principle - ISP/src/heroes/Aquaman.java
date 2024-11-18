package heroes;

import abilities.ISwimmable;
import abilities.IStrength;

public class Aquaman implements ISwimmable, IStrength {
    @Override
    public void swim() {
        System.out.println("Aquaman is swimming!");
    }

    @Override
    public void liftHeavyObjects() {
        System.out.println("Aquaman is lifting a submarine!");
    }
}
