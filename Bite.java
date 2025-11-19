package move;

import ru.ifmo.se.pokemon.*;

public final class Bite extends PhysicalMove{
    public Bite() {
        super(Type.DARK, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect eff = new Effect();
        eff.chance(30);
        if (eff.success())
            eff.flinch(opp);;
    }

    @Override
    protected String describe() {
        return "кусает противника";
    }
}
