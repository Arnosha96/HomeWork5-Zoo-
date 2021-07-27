package zoo.logs;

import zoo.Zoo;
import zoo.ZooImpl;
import zoo.model.AnimalCreator;
import zoo.model.Species;

import java.util.Locale;
import java.util.Scanner;

import static zoo.logs.Constants.*;

public class ParserCommands {
    private Scanner in = new Scanner(System.in);
    private String userCommand;
    private String[] command;
    private String split = " ";
    private ZooImpl zoo;

    public ParserCommands(ZooImpl zoo) {
        this.zoo = zoo;
    }

    public String[] enterCommand(){
        System.out.println(INPUT_OPTIONS);
        userCommand = in.nextLine();
        command = userCommand.split(split);
        return command;
    }

    public boolean parsCommand (String[] command, AnimalCreator animal){
        try {
            if (command[0].equalsIgnoreCase("check-in")) {
                if (command[1].equalsIgnoreCase("lion")) {
                    AnimalCreator animalLeon = (AnimalCreator) animal.getAnimal(Species.LION, command[2]);
                    zoo.checkInAnimal(animalLeon);
                }else if (command[1].equalsIgnoreCase("giraffe")) {
                    AnimalCreator animalGiraffe = (AnimalCreator) animal.getAnimal(Species.GIRAFFE, command[2]);
                    zoo.checkInAnimal(animalGiraffe);
                }else if (command[1].equalsIgnoreCase("squirrel")) {
                    AnimalCreator animalSquirrel = (AnimalCreator) animal.getAnimal(Species.SQUIRREL, command[2]);
                    zoo.checkInAnimal(animalSquirrel);
                }else if (command[1].equalsIgnoreCase("penguin")) {
                    AnimalCreator animalPenguin = (AnimalCreator) animal.getAnimal(Species.PENGUIN, command[2]);
                    zoo.checkInAnimal(animalPenguin);
                }else {
                    System.out.printf("Sorry, but we cannot add \"%s\" to the zoo, because our zoo can only contain lion, giraffe, penguin or squirrel.", command[1]);
                }
                return true;
            } else if (command[0].equalsIgnoreCase("check-out")) {
                animal = new AnimalCreator(command[1]);
                zoo.checkOutAnimal(animal);
                return true;
            } else if (command[0].equalsIgnoreCase("log")) {
                System.out.println(zoo.getHistory());
                return true;
            } else if (command[0].equalsIgnoreCase("exit")) {
                System.out.println("Thank you! We are waiting for you again!");
                return false;
            } else {
                System.out.println("Incorrect command entered! Please try again!");
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You didn't enter animal type or animal name! Please try again!");
            return true;
        }
    }
}
