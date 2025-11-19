package move;

import ru.ifmo.se.pokemon.*;

public final class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 100);
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
        return "кидает энергетический шар";
    }
}
