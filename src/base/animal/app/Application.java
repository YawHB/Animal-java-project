package base.animal.app;

import base.animal.model.Animal;

public class Application {
    public static void main(String[] args) {
        new Application().start();
    }

    public void start() {
        Animal animal = new Animal("Horsey the horsing horse", 137);
        System.out.println(animal);
    }
}
