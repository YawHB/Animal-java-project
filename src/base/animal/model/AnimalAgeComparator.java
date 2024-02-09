package base.animal.model;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        return ((Integer)o1.getAge()).compareTo(o2.getAge());
    }
}