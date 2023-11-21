package examples.solid_2_5.bad_example;

import java.util.List;

public class AnimalService {

    List<Animal> horses;
    List<Animal> birds;

    public void addHorse(Animal animal) {
        horses.add(animal);
    }

    public void addBird(Animal animal) {
        birds.add(animal);
    }

}
