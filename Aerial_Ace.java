package move;

import ru.ifmo.se.pokemon.*;

public final class Aerial_Ace extends PhysicalMove {
    public Aerial_Ace() {
        /*
         * power 60
         * accuracy 100
         * priority 0
         * hits 1
         */
        super(Type.FLYING, 60, 100, 0, 1);
    }

    /*
     * Aerial Ace deals damage and ignores changes to the Accuracy and Evasion stats.
     */
    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        att.setMod(Stat.HP, (int) Math.round(damage/3.0));
    }
    @Override
    protected String describe() {
        return "uses Aerial_Ace";
    }
}