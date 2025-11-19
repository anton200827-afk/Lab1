package move;

import ru.ifmo.se.pokemon.*;

public final class Double_Edge extends PhysicalMove {
    public Double_Edge() {
        /*
         * power 120
         * accuracy 100
         * priority 0
         * hits 1
         */
        super(Type.NORMAL, 120, 100, 0, 1);
    }

    /*
     * Double-Edge deals damage, but the user receives 1⁄3 of the damage it inflicted in recoil. 
     * In other words, if the attack does 90 HP damage to the opponent, the user will lose 30 HP.
     */
    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        att.setMod(Stat.HP, (int) Math.round(damage/3.0));
    }
    @Override
    protected String describe() {
        return "uses Double-Edge";
    }
}