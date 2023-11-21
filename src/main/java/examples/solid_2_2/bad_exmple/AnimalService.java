package examples.solid_2_2.bad_exmple;

import examples.solid_2_2.Animal;

import java.util.ArrayList;

public class AnimalService {

    public void makeSound(ArrayList<Animal> animals) {
        for(Animal a : animals) {
            if (a.name.equals("lion")) {
                System.out.println("aaar");
            }
        }
    }

}
