package move;

import ru.ifmo.se.pokemon.*;

public final class FocusBlast extends SpecialMove {
    public FocusBlast() {
        super(Type.FIGHTING, 120, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect eff = new Effect();
        eff.chance(10);
        if (eff.success())
            opp.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "фокусирует взрыв на противника";
    }
}
