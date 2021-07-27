package zoo.model.animals;

import zoo.model.AnimalCreator;
import zoo.model.Species;

public class Giraffe extends AnimalCreator {

    public Giraffe(String name) {
        super(name);
        this.species = Species.GIRAFFE;
    }
}
