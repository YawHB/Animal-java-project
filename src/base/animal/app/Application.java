package base.animal.app;

import base.animal.controller.AnimalController;
import base.animal.data.InitData;
import base.animal.model.Animal;
import base.animal.model.AnimalNameComparator;

import java.util.Collection;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        new Application().start();
    }

    public void start() {
        AnimalController controller = new AnimalController();
        InitData initData = new InitData(controller);
        initData.initData();


        List<Animal> animalList = (List<Animal>) controller.getAllAnimals();
            for (Animal animalOnList : animalList) {
                System.out.println(animalOnList);
            }
                System.out.println("---------------------------------------");

        Collection<Animal> sortedAnimals = controller.getAllAnimalsSorted(new AnimalNameComparator());
            for (Animal animal : sortedAnimals) {
                System.out.println(animal);
            }

        }
}
