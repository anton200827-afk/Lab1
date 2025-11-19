package move;

import ru.ifmo.se.pokemon.*;

public final class Roost extends StatusMove {

    public Roost() {
        /*
         * power -
         * accuracy -
         * priority 0
         * hits 1
         */
        super(Type.FLYING, 0, 0);
    }

    /*
     * User reases on the second level of HP
     */
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, 2);
    }

    @Override
    protected String describe() {
        return "uses Roost";
    }
}
