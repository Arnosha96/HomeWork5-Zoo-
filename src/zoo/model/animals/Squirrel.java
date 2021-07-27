package zoo.model.animals;

import zoo.model.AnimalCreator;
import zoo.model.Species;

public class Squirrel extends AnimalCreator {
    public Squirrel(String name) {
        super(name);
        this.species = Species.SQUIRREL;
    }
}
