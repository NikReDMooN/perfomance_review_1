package examples.solid_2_1.good_example;

import examples.solid_2_1.good_example.Animal;

import java.util.ArrayList;

public class AnimalDb {

    ArrayList<Animal> animals = new ArrayList<>();

    public void saveAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
        return this.animals;
    }

}
