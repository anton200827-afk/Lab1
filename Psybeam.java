package move;

import ru.ifmo.se.pokemon.*;

public final class Psybeam extends SpecialMove {
    public Psybeam() {
        super(Type.PSYCHIC, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect eff = new Effect();
        eff.chance(10);
        if (eff.success())
            eff.confuse(opp);
    }

    @Override
    protected String describe() {
        return "использует психолуч";
    }
}
