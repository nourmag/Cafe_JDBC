import java.util.Scanner;
import java.sql.*;
public class Cafe {
    public static void main(String[] args) {
        CoffeeFactory espressoFactory = new EspressoFactory();
        CoffeeFactory frenchCoffeeFactory = new FrenchCoffeeFactory();

        Coffee espresso = espressoFactory.makeCoffee();
        Coffee frenchCoffee = frenchCoffeeFactory.makeCoffee();

        Scanner scanner = new Scanner(System.in);
            boolean loop;
            do {
                int id = scanner.nextInt();
                loop = false;
                switch (id) {
                    case 1:
                        System.out.println("Espresso Coffee: ");
                        espresso.speak();
                        break;
                    case 2:
                        System.out.println("French Coffee: ");
                        frenchCoffee.speak();
                        break;
                    default:
                        System.out.println("Error! Not found ");
                        loop = true;
                }
            } while (loop);
    }
}