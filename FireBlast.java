package move;

import ru.ifmo.se.pokemon.*;

public final class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 110, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect eff = new Effect();
        eff.chance(10);
        if (eff.success())
            eff.burn(opp);
    }

    @Override
    protected String describe() {
        return "использует огненный взрыв";
    }
}
