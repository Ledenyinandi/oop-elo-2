package com.codecool.farm;

import com.codecool.farm.animal.Animal;
import java.util.ArrayList;
import java.util.List;

class Farm {

    private List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    void feedAnimals() {
        animals.forEach(Animal::feed);
    }

    void butcher(Butcher butcher) {
        animals.removeIf(butcher::canButcher);
    }

    boolean isEmpty() {
        return animals.isEmpty();
    }

    List<String> getStatus() {
        List<String> statusList = new ArrayList<>();
        for (Animal animal : animals) {
            statusList.add("There is a " + animal.getSize() + " sized " + animal.toString() + " in the farm.");
        }
        return statusList;
    }
}
