public class FrenchCoffeeFactory extends CoffeeFactory {
    @Override
    public Coffee makeCoffee() {
        return new FrenchCoffee("French Coffee", "CoffeeBeans", 2, true, true);
    }
}