//version 1
package inheritanceDemoV3;

public class Reptile extends Animal {

    private boolean hasScales;
    private boolean laysEggs;

    public Reptile(){
        //super(true, 4, "Carnivore");
    }

    public Reptile(boolean hasScales, boolean laysEggs){

        //super(true, 4, "Carnivore");
        this.hasScales = hasScales;
        this.laysEggs = laysEggs;
        //this();
    }

    public Reptile(boolean beingDangerous, int numberOfLegs, String diet, boolean hasScales, boolean laysEggs){

        //super(beingDangerous, numberOfLegs, diet);
        this.hasScales = hasScales;
        this.laysEggs = laysEggs;

    }

    public Reptile(Animal animal){
       // super(animal.isBeingDangerous(), animal.getNumberOfLegs(), animal.getDiet());
         //super(animal.beingDangerous,animal.numberOfLegs, animal.diet);
    }


    @Override
    public void makeNoise(){
        //super.makeNoise();
        System.out.println(" Hiss~~~");
    }

    @Override
    public void eat(){
        //super.eat();
        System.out.println(" Yummmy ");
    }


}
