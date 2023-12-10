package examples.solid_2_5.good_example;

public class Animal {

    public String name;

    public static AnimalService animalServiceImpl = new AnimalServiceImpl();

    public Animal(String name) {
        this.name = name;
        animalServiceImpl.addAnimal(this);
    }
}
