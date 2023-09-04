package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose a drink:
                     1 - Espresso
                     2 - Cappuccino
                     3 - Latte""");

        Validation validator = new Validation(scanner);
        int option = validator.validate();

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        switch (option) {
            case 1 -> coffeeMachine.setCoffee(new Espresso());
            case 2 -> coffeeMachine.setCoffee(new Cappuccino());
            case 3 -> coffeeMachine.setCoffee(new Latte());
            default -> System.out.println("No such option");

        }
        coffeeMachine.start();
    }
}
