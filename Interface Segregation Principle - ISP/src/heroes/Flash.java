package heroes;

import abilities.IStrength;

public class Flash implements IStrength {
    @Override
    public void liftHeavyObjects() {
        System.out.println("The Flash is using his strength to move objects!");
    }
}
