import java.util.Random;

public class RandomNbGenerator {
    private final Random rnd = new Random();

    public int generateRandomNumber(int n1, int n2) {
        return rnd.nextInt(n1, n2);
    }
}
