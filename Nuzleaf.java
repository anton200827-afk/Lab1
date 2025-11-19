package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Nuzleaf extends Seedot {
    public Nuzleaf(String name, int level) {
        super(name, level);

        setType(Type.GRASS);
        setStats(70, 70, 40, 60, 40, 60);

        setMove(new Swagger(), new Facade(), new Growth());
    }
}