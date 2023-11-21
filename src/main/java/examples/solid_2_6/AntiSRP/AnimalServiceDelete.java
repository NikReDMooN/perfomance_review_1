package examples.solid_2_6.AntiSRP;

import java.util.List;

public class AnimalServiceDelete {

    public void delete(List<Animal> animalList, Animal animal) {
        animalList.remove(animal);
    }

}
