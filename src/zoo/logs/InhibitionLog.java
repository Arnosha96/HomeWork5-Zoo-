package zoo.logs;

import javafx.util.Builder;
import zoo.model.Species;

import java.util.Date;

public class InhibitionLog {
    private Date checkInDate;
    private Date checkOutDate;
    private Species animalSpecies;
    private String animalName;

    @Override
    public String toString() {
        return "InhibitionLog{" +
                "checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", animalSpecies=" + animalSpecies +
                ", animalName='" + animalName + '\'' +
                '}' + "\n";
    }

    static class LogBuilder{
        private final InhibitionLog log;

        public LogBuilder(){
            log = new InhibitionLog();
        }

        public LogBuilder withInDate(Date checkInDate){
            log.checkInDate = checkInDate;
            return this;
        }

        public LogBuilder withOutDate(Date checkOutDate){
            log.checkOutDate = checkOutDate;
            return this;
        }

        public  LogBuilder withSpecies(Species species){
            log.animalSpecies = species;
            return this;
        }

        public LogBuilder withName (String name){
            log.animalName = name;
            return this;
        }

        public InhibitionLog build(){
            return log;
        }
    }
}

