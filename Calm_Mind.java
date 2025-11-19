package move;

import ru.ifmo.se.pokemon.*;

public final class Calm_Mind extends StatusMove{

    public Calm_Mind() {
        /*
         * power -
         * accuracy -
         * priority 0
         * hits 1
         */
        super(Type.PSYCHIC, 0, 0);
    }

    /*
     * Calm Mind raises the user's Special Attack and Special Defense by one stage each.
     */
    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, 1));
        p.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, 1));
    }

    @Override
    protected String describe() {
        return "uses Calm Mind";
    }
}