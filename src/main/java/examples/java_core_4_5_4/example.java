package examples.java_core_4_5_4;

import java.util.function.Consumer;
import java.util.function.Function;

public class example {

    void a() {
        Consumer consumer = System.out::println;
        int b = 5;
        consumer.accept(b);
    }

}
