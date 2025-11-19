package move;

import ru.ifmo.se.pokemon.*;

public final class FocusEnergy extends StatusMove {
    public FocusEnergy() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon self) {
        self.setMod(Stat.ACCURACY, 2);
    }

    @Override
    protected String describe() {
        return "фокусирует энергию";
    }
}
