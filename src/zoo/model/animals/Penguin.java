package zoo.model.animals;

import zoo.model.AnimalCreator;
import zoo.model.Species;

public class Penguin extends AnimalCreator {
    public Penguin(String name) {
        super(name);
        this.species = Species.PENGUIN;
    }
}
