package InterfacesDemo.Game;

import java.util.ArrayList;
import java.util.List;
import static java.lang.String.valueOf;

public class King implements ISavable {
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
        value.add(0, this.name);
        value.add(1, valueOf(this.points));
        value.add(2, this.direction);
        // value.add(3, this.color);
        return value;
    }

    @Override
    public void read(List<String> lsv) {
        if (lsv != null && lsv.size() > 0) {
            this.name = lsv.get(0);
            this.points = Integer.parseInt(lsv.get(1));
            this.direction = lsv.get(2);
        }
    }

    public String toString() {
        return "King: " + name + " points: " + points + " direction: " + direction + ", color: " + color;
    }
}
