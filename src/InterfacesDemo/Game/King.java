package InterfacesDemo.Game;

import java.util.ArrayList;
import java.util.List;
import static java.lang.String.valueOf;

public class King {
    private String name;
    private int points;
    private String direction;
    private String color;

    public King(String name, int points, String direction, String color) {
        this.name = name;
        this.points = points;
        this.direction = direction;
        this.color = color;
    }

    @Override
    public List<String> write() {
        List<String> value = new ArrayList<String>();
        value.add(this.name);
        value.add(valueOf(this.points));
        value.add(this.direction);
        value.add(this.color);
    }
}
