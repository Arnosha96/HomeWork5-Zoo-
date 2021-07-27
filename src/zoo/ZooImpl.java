package zoo;

import zoo.logs.InhibitionLog;
import zoo.Zoo;
import zoo.logs.Logger;
import zoo.model.*;

import java.util.List;

import static zoo.logs.Constants.*;

public class ZooImpl implements Zoo {

    Logger logger = new Logger();

    private CageImpl cageOne = new CageImpl(1, 150.00, new ConditionImpl(Species.LION), true, (AnimalCreator) new AnimalCreator().getAnimal(Species.LION, ""));
    private CageImpl cageTwo = new CageImpl(1, 200.00, new ConditionImpl(Species.GIRAFFE), true, (AnimalCreator) new AnimalCreator().getAnimal(Species.GIRAFFE, ""));
    private CageImpl cageThree = new CageImpl(1, 50.00, new ConditionImpl(Species.SQUIRREL), true, (AnimalCreator) new AnimalCreator().getAnimal(Species.SQUIRREL, ""));
    private CageImpl cageFour = new CageImpl(1, 100.00, new ConditionImpl(Species.PENGUIN), true, (AnimalCreator) new AnimalCreator().getAnimal(Species.PENGUIN, ""));


    @Override
    public void checkInAnimal(Animal animal) {
        if (animal.getName().equalsIgnoreCase(cageOne.getAnimal().getName()) || animal.getName().equalsIgnoreCase(cageTwo.getAnimal().getName()) || animal.getName().equalsIgnoreCase(cageThree.getAnimal().getName())|| animal.getName().equalsIgnoreCase(cageFour.getAnimal().getName())){
            System.out.println("I'm sorry, but an animal with that name already lives in our zoo.");
        }else{
            switch (animal.getSpecies()){
                case LION:
                    if (cageOne.isVacantCage()){
                        cageOne.setVacantCage(false);
                        cageOne.setAnimal((AnimalCreator) animal);
                        logger.addLogIn(animal);
                        System.out.println(CHECK_IN_SUCCESS);
                    }else{
                        System.out.println(CHECK_IN_FAILED);
                    }
                    break;
                case GIRAFFE:
                    if (cageTwo.isVacantCage()){
                        cageTwo.setVacantCage(false);
                        cageTwo.setAnimal((AnimalCreator) animal);
                        logger.addLogIn(animal);
                        System.out.println(CHECK_IN_SUCCESS);
                    }else{
                        System.out.println(CHECK_IN_FAILED);
                    }
                    break;
                case SQUIRREL:
                    if (cageThree.isVacantCage()){
                        cageThree.setVacantCage(false);
                        cageThree.setAnimal((AnimalCreator) animal);
                        logger.addLogIn(animal);
                        System.out.println(CHECK_IN_SUCCESS);
                    }else{
                        System.out.println(CHECK_IN_FAILED);
                    }
                    break;
                case PENGUIN:
                    if (cageFour.isVacantCage()){
                        cageFour.setVacantCage(false);
                        cageFour.setAnimal((AnimalCreator) animal);
                        logger.addLogIn(animal);
                        System.out.println(CHECK_IN_SUCCESS);
                    }else{
                        System.out.println(CHECK_IN_FAILED);
                    }
                    break;
                default: throw new IllegalArgumentException("Animal type is not correct!");
            }
        }
    }

    @Override
    public void checkOutAnimal(Animal animal) {
        if (animal.getName().equalsIgnoreCase(cageOne.getAnimal().getName())) {
            AnimalCreator emptyAnimal = (AnimalCreator) new AnimalCreator().getAnimal(cageOne.getAnimal().getSpecies(), "");
            logger.addLogOut(animal);
            cageOne.setVacantCage(true);
            cageOne.setAnimal(emptyAnimal);
            System.out.println(CHECK_OUT_SUCCESS);
        } else if (animal.getName().equalsIgnoreCase(cageTwo.getAnimal().getName())) {
            AnimalCreator emptyAnimal = (AnimalCreator) new AnimalCreator().getAnimal(cageTwo.getAnimal().getSpecies(), "");
            logger.addLogOut(animal);
            cageTwo.setVacantCage(true);
            cageTwo.setAnimal(emptyAnimal);
            System.out.println(CHECK_OUT_SUCCESS);
        } else if (animal.getName().equalsIgnoreCase(cageThree.getAnimal().getName())) {
            AnimalCreator emptyAnimal = (AnimalCreator) new AnimalCreator().getAnimal(cageThree.getAnimal().getSpecies(), "");
            logger.addLogOut(animal);
            cageThree.setVacantCage(true);
            cageThree.setAnimal(emptyAnimal);
            System.out.println(CHECK_OUT_SUCCESS);
        } else if (animal.getName().equalsIgnoreCase(cageFour.getAnimal().getName())) {
            AnimalCreator emptyAnimal = (AnimalCreator) new AnimalCreator().getAnimal(cageFour.getAnimal().getSpecies(), "");
            logger.addLogOut(animal);
            cageFour.setVacantCage(true);
            cageFour.setAnimal(emptyAnimal);
            System.out.println(CHECK_OUT_SUCCESS);
        } else
            System.out.println("I'm sorry, but an animal with that name wasn't found. Please, try again!");
    }

    @Override
    public List<InhibitionLog> getHistory() {
        return logger.getLogs();
    }
}
