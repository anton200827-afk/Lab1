package move;

import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove {
    public Facade() {
        /*
         * power 70
         * accuracy 100
         * priority 0
         * hits 1
         */
        super(Type.NORMAL, 70, 100, 0, 1);
    }

    /*
     * Facade deals damage, and hits with double power (140) if the user is burned,
     * poisoned or paralyzed.
     * 
     * In the case of a burn, the usual attack-halving still occurs so Facade hits
     * with an effective power of 70.
     */
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK,
                switch (p.getCondition().toString()) {
                    case "burned", "poisoned", "paralyzed" -> 2;
                    default -> 1;
                });
    }

    @Override
    protected String describe() {
        return "uses Facade";
    }
}