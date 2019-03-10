package sample;

public class ShoeFactory extends Factory {
    @Override
    public void production() {
        System.out.println( name );
    }
}
