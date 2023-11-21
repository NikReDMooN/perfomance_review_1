package examples.solid_2_1.bad_example;

import java.util.ArrayList;

public class Animal {

    String name;

    ArrayList<Animal> animals = new ArrayList<>();

    public Animal (String s){
        this.name = s;
    }

    public void saveAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
        return this.animals;
    }

}
