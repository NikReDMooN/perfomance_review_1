package examples.java_core_4_5_5.noncapturing;

import java.math.BigDecimal;
import java.util.function.Function;

public class example {

    void a() {
        Function<BigDecimal, BigDecimal> func = (a) -> a.multiply(BigDecimal.TEN);

        for (int j = 0; j < 999999999; j++) {
            func.apply(new BigDecimal(j));
        }
    }

}
