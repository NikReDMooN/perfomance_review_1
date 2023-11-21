package examples.oop_1_2;

public class TestClass extends Parent implements TestInterface{

    @Override
    public void goodbye() {
        this.hello();
        System.out.println("Good Bye");
    }

}
