package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Spearow extends Pokemon {
    public Spearow(String name, int level) {
        super(name, level);

        setType(Type.FLYING);
        setStats(40, 60, 30, 31, 31, 70);

        setMove(new Roost(), new Focus_Energy(), new Confide());
    }
}