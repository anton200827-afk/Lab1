package move;

import ru.ifmo.se.pokemon.*;

public final class Swagger extends StatusMove {

    public Swagger() {
        /*
         * power 0
         * accuracy 85
         * priority 0
         * hits 1
         */
        super(Type.NORMAL, 0, 85, 0, 1);
    }

    /*
     * Swagger confuses the target and raises its Attack by two stages.
     */
    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect eff = new Effect();
        eff.confuse(opp);
        opp.setMod(Stat.ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "uses Swagger";
    }
}
