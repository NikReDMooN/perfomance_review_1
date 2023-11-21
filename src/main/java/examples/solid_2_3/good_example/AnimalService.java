package examples.solid_2_3.good_example;

import examples.solid_2_3.good_example.Animal;

import java.util.ArrayList;

public class AnimalService {

    public Integer countLegs(ArrayList<Animal> animals) {
        var count = 0;
        for (Animal a : animals) {
            count += a.countOfLegslegs();
        }

        return count;
    }
}
