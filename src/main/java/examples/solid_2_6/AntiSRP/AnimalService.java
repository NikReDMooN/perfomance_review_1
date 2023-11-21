package examples.solid_2_6.AntiSRP;

import java.util.List;

public class AnimalService {

    public List<Animal> animals;

    public AnimalServiceAdd animalServiceAdd;

    public AnimalServiceGet animalServiceGet;

    public AnimalServiceDelete animalServiceDelete;


    public void add(Animal animal) {
        animalServiceAdd.add(this.animals, animal);
    }

    public void delete(Animal animal) {
        animalServiceDelete.delete(this.animals, animal);
    }

    public List<Animal> get() {
        return animalServiceGet.get(this.animals);
    }

}
