package examples.java_core_4_6_8;


import java.util.ArrayList;
import java.util.List;

public class example {

    void a() {
        List<Integer> array = List.of(1,2,3,4,5);
        var a = array.stream().filter(p -> p % 2 == 0)
                .findFirst().get();
        System.out.println(a);
    }

}
