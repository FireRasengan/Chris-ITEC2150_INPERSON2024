package inheritanceDemoV3;

public class Mammal extends Animal {

    private boolean hasFur;
    private boolean giveBirth;

    public Mammal(){
        //super(false,2, "Omnivore");
    }

    public Mammal(boolean hasFur, boolean giveBirth){
        //super(false, 2, "Carnivore");
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
        //this();
    }

    public Mammal(boolean beingDangerous, int numberOfLegs, String diet, boolean hasFur, boolean giveBirth){
        //super(beingDangerous, numberOfLegs, diet);
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
    }

    public Mammal(Animal animal){
        //super(animal.beingDangerous,animal.numberOfLegs, animal.diet);
    }

    public Mammal(Animal animal, boolean hasFur, boolean giveBirth){
        //super(animal.beingDangerous,animal.numberOfLegs, animal.diet);
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
    }

    public Mammal(String name, boolean hasFur, boolean giveBirth){
        //super();
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
    }

    @Override
    public void makeNoise(){
        //super.makeNoise();
        System.out.println(" Meow~~~");
    }

    @Override
    public void eat(){
        //super.eat();
        System.out.println(" Yummy ");
    }

}
