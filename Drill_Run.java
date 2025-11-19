package move;

import ru.ifmo.se.pokemon.*;

public final class Drill_Run extends PhysicalMove {

    public Drill_Run() {
        /*
         * power 80
         * accuracy 95
         * priority 0
         * hits 1
         */
        super(Type.GROUND, 80, 95, 0, 1);
    }

    /*
     * Drill Run deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄24).
     */
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.15).turns(1).stat(Stat.ATTACK, 2));
    }

    @Override
    protected String describe() {
        return "uses Drill_Ruun";
    }
}