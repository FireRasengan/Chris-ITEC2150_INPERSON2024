package InterfacesDemo.ClonableDemoHouse;
import java.util.Date;

public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private Date built;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        this.built = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Object cloneShallow() {
        try {
            return super.clone();
        } catch(CloneNotSupportedException e) {
            return null;
        }
    }

    public Object cloneDeep() {
        House houseClone = new House(id, area);
        houseClone.built = new Date();

        houseClone.built.setTime(built.getTime());

        return houseClone;
    }

    public Object clone() throws CloneNotSupportedException {
        House hc = (House)super.clone();
        hc.built = (Date)built.clone();
        return hc;
    }

    public int compareTo(House o) {
        /*if (this.area == o.area) {
            return 0;
        }
        else if (this.area > o.area) {
            return 1;
        }
        else return -1;*/

        return this.area > o.area? -1: (this.area < o.area)? 1:0;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        House that = (House)o;
        return this.id == ((House)o).getId() &&
                this.built.equals(((House)o).built) &&
                this.area == ((House)o).getArea();
    }
}