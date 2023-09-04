package app;

public class CoffeeMachine {

    private Coffee coffee;

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public void start() {
        coffee.makeCoffee();
    }
}
