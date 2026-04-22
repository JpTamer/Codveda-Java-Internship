public class GuessingEngine {
    private final int randNumber;
    private int attempts;

    public GuessingEngine(RandomNbGenerator generator, int min, int max, int attempts) {
        randNumber = generator.generateRandomNumber(min, max);
        this.attempts = attempts;
    }

    public String guessStatus(int guess) {
        attempts--;
        if (guess == randNumber) {
            return "Correct";
        } else if (guess > randNumber) {
            return "High";
        }
        return "Low";
    }

    public int getAttempts() {
        return attempts;
    }

}
