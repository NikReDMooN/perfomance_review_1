package examples.solid_2_4.bad_example;

public class Lion implements Animal{


    @Override
    public void eatGrass() {
        System.out.println("WHAT?!");
    }

    @Override
    public void eatMet() {
        System.out.println("nym nym");
    }
}
