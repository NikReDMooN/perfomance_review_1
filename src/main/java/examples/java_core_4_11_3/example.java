package examples.java_core_4_11_3;

public class example {

    void a() {
        Class a = MyClass.class;
        if (a.isAnnotationPresent(MyAnnotation.class)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
