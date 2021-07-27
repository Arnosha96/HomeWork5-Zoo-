package zoo.logs;

public class Constants {
    public static final String INPUT_OPTIONS = "Enter one of the following commands:\n" +
            "1). <check-in> [animal-species] [animal-name]\n" +
            "2). <check-out> [animal-name]\n" +
            "3). <log>\n" +
            "4). <exit>";
    public static final String CHECK_IN_SUCCESS = "Congratulations, your animal has found a new home!";
    public static final String CHECK_OUT_SUCCESS = "Success! You can pick up the animal from the back exit.";
    public static final String CHECK_IN_FAILED = "Sorry, but this animal's cage is busy.";
}
