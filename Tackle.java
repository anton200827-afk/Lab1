package move;

import ru.ifmo.se.pokemon.*;

public final class Tackle extends PhysicalMove{
    public Tackle() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe() {
        return "хватает противника";
    }
}
