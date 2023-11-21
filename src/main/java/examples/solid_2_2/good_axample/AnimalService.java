package examples.solid_2_2.good_axample;

import examples.solid_2_2.Animal;

import java.util.ArrayList;

public class AnimalService {

    public void makeSound(ArrayList<Animal> animals) {
        for(Animal a : animals) {
            System.out.println(a.sound);
        }
    }

}
