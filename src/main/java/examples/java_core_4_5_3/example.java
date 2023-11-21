package examples.java_core_4_5_3;

import java.util.function.Function;
import java.util.function.Supplier;

class Animal{

    public Animal() {

    }

    public Animal(Cell[] cells) {

    }

}

class Cell{

}

public class example {

    Supplier<Animal> a = () -> {return new Animal();};

    Function<Cell[], Animal> b = (n) -> {return new Animal(n);};

}
