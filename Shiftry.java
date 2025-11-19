package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Shiftry extends Seedot {
    public Shiftry(String name, int level) {
        super(name, level);

        setType(Type.GRASS);
        setStats(90, 100, 60, 90, 60, 80);

        setMove(new Swagger(), new Facade(), new Growth(), new Aerial_Ace());
    }
}