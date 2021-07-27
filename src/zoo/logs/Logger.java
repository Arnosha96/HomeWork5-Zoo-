package zoo.logs;

import zoo.logs.InhibitionLog;
import zoo.model.Animal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Logger extends InhibitionLog{
    List<InhibitionLog> logs = new ArrayList<>();

    public void addLogIn (Animal animal){
        logs.add(new InhibitionLog.LogBuilder()
                .withInDate(new Date())
                .withName(animal.getName())
                .withSpecies(animal.getSpecies())
                .build()
        );
    }

    public void addLogOut (Animal animal){
        logs.add(new InhibitionLog.LogBuilder()
                .withOutDate(new Date())
                .withName(animal.getName())
                .withSpecies(animal.getSpecies())
                .build()
        );
    }

    public List<InhibitionLog> getLogs(){
        return logs;
    }
}
