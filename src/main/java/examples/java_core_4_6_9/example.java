package examples.java_core_4_6_9;

import java.util.Arrays;
import java.util.List;

public class example {

    void a() {
        List<Integer> a = List.of(1,5,7,3,4,10);
        a.stream().sorted().toList();
        System.out.println(Arrays.toString(a.toArray()));
    }

}
