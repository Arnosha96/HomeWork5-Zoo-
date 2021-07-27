package zoo.model;

import zoo.model.animals.Giraffe;
import zoo.model.animals.Lion;
import zoo.model.animals.Penguin;
import zoo.model.animals.Squirrel;

public class AnimalCreator implements Animal {
    protected String name;
    protected Species species;

    public Animal getAnimal (Species species, String name){
        AnimalCreator animal;
        switch (species) {
            case LION: animal = new Lion(name);
            break;
            case GIRAFFE: animal = new Giraffe(name);
            break;
            case PENGUIN: animal = new Penguin(name);
            break;
            case SQUIRREL: animal = new Squirrel(name);
            break;
            default: throw new IllegalArgumentException("The type is not correct!");
        }
        return animal;
    }

    public AnimalCreator(Species species, String name) {
        this.name = name;
        this.species = species;
    }

    public AnimalCreator(String name) {
        this.name = name;
    }

    public AnimalCreator() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Species getSpecies() {
        return species;
    }
}
