package move;

import ru.ifmo.se.pokemon.*;

public final class Focus_Energy extends StatusMove {
    public Focus_Energy() {
        super(Type.NORMAL, 0, 0);
    }
    /*
     * Increases critical hit ratio.
     */

    @Override
    protected void applySelfEffects(Pokemon self) {
        self.setMod(Stat.ACCURACY, 2);
    }

    @Override
    protected String describe() {
        return "uses Focus Energy";
    }
}