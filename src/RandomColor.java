import java.util.Random;
import java.util.function.Supplier;

public class RandomColor implements Supplier<String> {
    private static final String[] COLORS = {"green", "red", "yellow", "black", "blue", "white", "grey"};

    @Override
    public String get() {
        Random random = new Random();
        return COLORS[random.nextInt(COLORS.length)];
    }

}
