package InterfacesDemo.ClonableDemoHouse;

/**
 * HouseTester.java
 * This class is a part of the "Interfaces" demonstration.
 *
 */
public class HouseTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        House house1 = new House(1, 100);
        House house2 = (House)house1.cloneShallow();
        House house3 = (House)house1.cloneDeep();

        //shallow clone
        System.out.println(house1 == house2);
        System.out.println(house1.equals(house2));

        //deep clone
        System.out.println(house1 == house3);
        System.out.println(house2.equals(house3));


        System.out.println(house1.equals(house3));
        House house4 = (House) house3.clone();


        Object house5 = house3.clone(); //is this deep clone or shallow clone?
        System.out.println(house4);

        System.out.println(house3 == house4);
        System.out.println(house3 == house5);

        System.out.println(house5.equals(house3));

    }
}