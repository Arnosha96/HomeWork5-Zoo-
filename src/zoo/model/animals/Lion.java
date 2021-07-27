package zoo.model.animals;

import zoo.model.AnimalCreator;
import zoo.model.Species;

public class Lion extends AnimalCreator {
    public Lion(String name) {
        super(name);
        this.species = Species.LION;
    }
}
