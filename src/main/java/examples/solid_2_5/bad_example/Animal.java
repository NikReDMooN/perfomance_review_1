package examples.solid_2_5.bad_example;

public class Animal {

    public String name;

    public static AnimalService animalService = new AnimalService();

    public Animal(String name) {
        this.name = name;
        if (name.equals("horse")) {
            animalService.addHorse(this);
        }
        if (name.equals("bird")) {
            animalService.addBird(this);
        }
    }
}
