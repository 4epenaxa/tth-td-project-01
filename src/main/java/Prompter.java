import java.util.Scanner;

public class Prompter {
  private Jar jar;
  private Scanner scanner;

  public Prompter() {
    scanner = new Scanner(System.in);
  }

  public void gettingData() {

    System.out.println("We need to setup this game, please answer for questions below:");
    System.out.println("---------");
    System.out.print("What type of item should go in the jar: ");
    String itemType = scanner.nextLine();
    System.out.printf("What is the maximum amount of %s that should go in the jar: ",
            itemType);
    int maxAmount = scanner.nextInt();

    jar = new Jar(itemType, maxAmount);
  }

  public void playingGame() {
    int choise;
    int attempts = 0;
    System.out.printf("%n%n%nLETS PLAY%n---------------------%n");
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %d.%n%n%n",
            jar.getItemType(),
            jar.getMaxAmount());
    do {
      System.out.printf("Guess: ");
      choise = scanner.nextInt();
      attempts++;
    } while (choise != jar.getRandomFromMaxAmount());

    System.out.printf("You got it in %d attempt(s)%n", attempts);
  }

}