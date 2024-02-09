package base.animal.controller;

import base.animal.model.Animal;


import java.util.*;

public class AnimalController {
    private int lastId;
    private final HashMap<Integer, Animal> animals = new HashMap<>();

    public Animal createAnimal(Animal animal) {
        // create new via copy-constructor
        Animal newAnimal = new Animal(animal);
        // set id
        newAnimal.setId(lastId++);
        // update lastId field
        this.lastId++;
        // save to collection
        animals.put(newAnimal.getId(), newAnimal);

        return newAnimal;
    }

    public List<Animal> getAllAnimals() {
        return new ArrayList<>(animals.values());
    }

   public Collection<Animal> getAllAnimalsSorted(){
   return new TreeSet<>(animals.values());
    }

    public List<Animal> getAllAnimalsSorted(Comparator<Animal> comparator){
    List list = new ArrayList<>(animals.values());
    list.sort(comparator);
    return list;
    }



}
