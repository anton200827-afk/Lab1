package move;

import ru.ifmo.se.pokemon.*;

public final class Extrasensory extends SpecialMove{
    public Extrasensory() {
        super(Type.PSYCHIC, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect eff = new Effect();
        eff.chance(10);
        if (eff.success())
            eff.flinch(opp);;
    }
    @Override
    protected String describe() {
        return "атакует экстрасенсорными способностями";
    }
}
