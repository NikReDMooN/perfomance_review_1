package examples.solid_2_5.good_example;

import java.util.List;

public class AnimalService {

    List<Animal> horses;
    List<Animal> birds;

    public void addAnimal(Animal animal) {
        if (animal.name.equals("horse")) {
            this.addHorse(animal);
        }
        if (animal.name.equals("bird")) {
            this.addBird(animal);
        }
    }

    public void addHorse(Animal animal) {
        horses.add(animal);
    }

    public void addBird(Animal animal) {
        birds.add(animal);
    }

}
