import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Colors {
    RED,
    BLUE,
    BLACK,
    WHITE,
    GREY,
    YELLOW,
    PINK,
    PURPLE;

    private static final List<Colors> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Colors randomColor() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}