package examples.solid_2_5.good_example;

public class Animal {

    public String name;

    public static AnimalService animalService = new AnimalService();

    public Animal(String name) {
        this.name = name;
        animalService.addAnimal(this);
    }
}
