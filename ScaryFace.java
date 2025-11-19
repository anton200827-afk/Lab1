package move;

import ru.ifmo.se.pokemon.*;

public final class ScaryFace extends StatusMove{
    public ScaryFace() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        opp.setMod(Stat.SPEED, -2);
    }

    @Override
    protected String describe() {
        return "пугает противника";
    }
}
