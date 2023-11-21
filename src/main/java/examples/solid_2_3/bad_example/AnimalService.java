package examples.solid_2_3.bad_example;

import java.util.ArrayList;

public class AnimalService {

    public Integer countLegs(ArrayList<Animal> animals) {
        var count = 0;
        for (Animal a : animals) {
            if (a instanceof Lion) {
                count +=4;
            }
            if (a instanceof Bird) {
                count +=2;
            }
        }

        return count;
    }
}
