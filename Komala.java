package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;

public class Komala extends Pokemon{
    public Komala(String name, int level) {
        super(name, level);

        setType(Type.NORMAL);
        setStats(65, 115, 65, 75, 95, 65);

        setMove(new Facade(), new Double_Edge(), new Calm_Mind(), new Confide());
    }
}