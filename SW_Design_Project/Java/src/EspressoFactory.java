public class EspressoFactory extends CoffeeFactory {
    @Override
    public Coffee makeCoffee() {
        return new Espresso("Espresso", "Arabian", 1, false, false);
    }
}