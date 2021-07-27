package zoo;

import zoo.logs.ParserCommands;
import zoo.model.AnimalCreator;

public class Main {
    public static void main(String[] args) {
        final String START_NOTIFICATION = "Hello!\n" +
            "We are happy to welcome you to our zoo.";
        boolean flag = true;
        ZooImpl zoo = new ZooImpl();
        AnimalCreator animal = new AnimalCreator();
        ParserCommands parserCommands = new ParserCommands(zoo);

        System.out.println(START_NOTIFICATION);
        while (flag){
            flag = parserCommands.parsCommand(parserCommands.enterCommand(), animal);
        }
    }
}
