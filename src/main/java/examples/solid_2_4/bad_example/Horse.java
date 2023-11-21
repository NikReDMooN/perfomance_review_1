package examples.solid_2_4.bad_example;

public class Horse implements Animal{
    @Override
    public void eatGrass() {
        System.out.println("nyam nyam");
    }

    @Override
    public void eatMet() {
        System.out.println("WHAT?!");
    }
}
