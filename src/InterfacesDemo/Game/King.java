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
        value.add(3, this.color);
        return value;
    }

    @Override
    public void read(List<String> lsv) {
        if (lsv != null && lsv.size() > 0) {
            this.name = lsv.get(0);
            this.points = Integer.parseInt(lsv.get(1));
            this.direction = lsv.get(2);
            this.color = lsv.get(3);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "King: " + name + " points: " + points + " direction: " + direction + ", color: " + color;
    }
}