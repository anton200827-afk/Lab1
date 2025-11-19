package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Seedot extends Pokemon {
    public Seedot(String name, int level) {
        super(name, level);

        setType(Type.GRASS);
        setStats(40, 40, 50, 30, 30, 30);

        setMove(new Swagger(), new Facade());
    }
}