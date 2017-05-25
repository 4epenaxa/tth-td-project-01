public class GuessingGame {
    private Prompter prompter;
    private Jar jar;
    private int guess = 0;
    private int triesCount = 0;

    public static void main(String[] args) {
        GuessingGame ggame = new GuessingGame();
        ggame.play();
    }

    GuessingGame(){
        prompter = new Prompter();
        jar = prompter.jarPrompting();
    }

    public void play() {
        boolean isWon = false;

        while (!isWon) {
            askForAGuess();

            if (guess == jar.getRandomFromMaxAmount()) {
                isWon = true;
                prompter.winCongratulations(triesCount);
            } else
            if (guess < jar.getRandomFromMaxAmount()) {
                prompter.guessIsLower();
            } else
            if (guess > jar.getRandomFromMaxAmount()) {
                prompter.guessIsHigher();
            }
        }
    }
    private void askForAGuess() {
        boolean isValid = false;

        while (!isValid) {
            try {
                guess = Integer.valueOf(prompter.promptForAGuess(jar));
                if (guess <= jar.getMaxAmount() && guess > 0) {
                    isValid = true;
                    triesCount++;
                } else {
                    prompter.againstZero(jar);
                }
            } catch (NumberFormatException nfe) {
                prompter.incorrectInput();
            }
        }
    }
}