package base.animal.data;

import base.animal.controller.AnimalController;
import base.animal.model.Animal;

public class InitData {
    private AnimalController controller;


    public InitData(AnimalController animalController) {
        this.controller = animalController;
    }

    public void initData(){
        controller.createAnimal(new Animal("Yawsey the yawning horse", 145));
        controller.createAnimal(new Animal("Lolsey the lolling horse", 121));
        controller.createAnimal(new Animal("Horsey the horsing horse", 137));
    }
}
