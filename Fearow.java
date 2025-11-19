package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Fearow extends Spearow {
    public Fearow(String name, int level) {
        super(name, level);

        setType(Type.FLYING);
        setStats(65, 90, 65, 61, 61, 100);

        setMove(new Roost(), new Focus_Energy(), new Confide(), new Drill_Run());
    }
}