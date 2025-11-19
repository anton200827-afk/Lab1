package move;

import ru.ifmo.se.pokemon.*;

public final class Growth extends StatusMove {

    public Growth() {
        /*
         * power -
         * accuracy -
         * priority 0
         * hits 1
         */
        super(Type.NORMAL, 0, 0);
    }

    /*
     * Growth raises the user's Attack and Special Attack by one stage each.
     */
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 1);
        p.setMod(Stat.SPECIAL_ATTACK, 1);
    }

    @Override
    protected String describe() {
        return "uses Growth";
    }
}
