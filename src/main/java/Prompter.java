import java.util.Scanner;

public class Prompter {
  private Scanner scanner;

  public Prompter() {
    scanner = new Scanner(System.in);
  }

  public Jar jarPrompting() {
    String itemType = "";
    int maxAmount = 0;
    System.out.println("We need to setup this game, please answer for questions below:");
    System.out.println("--------------------------------------------------------------");

    //DRY
    do{
      System.out.print("What type of item should go in the jar: ");
      itemType = scanner.nextLine();
      if (itemType.equals("")){
        System.out.printf("Incorrect! Please try again!%n");
      }
    }
    while (itemType.equals(""));

    //DRY
    boolean maxAmountable = false;
    do {
      System.out.printf("What is the maximum amount of %s that should go in the jar: ",
              itemType);
      String maxAmountS = scanner.nextLine();
      try {
        maxAmount = Integer.parseInt(maxAmountS);
        if (maxAmount > 0){
          maxAmountable = true;
        } else { System.out.printf("Number must be > 0%n"); }

      } catch(NumberFormatException e) {
        System.out.printf("Incorrect! Please try again! You need to type a number.%n");
      } catch(NullPointerException e) {
        System.out.printf("Incorrect! Please try again! You need to type a number.%n");
      }
    } while (! maxAmountable);

    System.out.printf("%n%nLETS PLAY%n---------%n");
    return new Jar(itemType, maxAmount);
  }

  public String promptForAGuess (Jar jar) {
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %d: ",
            jar.getItemType(),
            jar.getMaxAmount());
    return scanner.nextLine();
  }

  public void guessIsLower() {
    System.out.println("Your guess is too low");
  }
  public void guessIsHigher() {
    System.out.println("Your guess is too high");
  }
  public void winCongratulations (int guessCount) {
    System.out.println("Congratulations! You won!!!");
    if (guessCount == 1) {
      System.out.printf ("You got it in %d attempt.%n%n", guessCount);
    } else {
      System.out.printf ("You got it in %d attempts.%n%n", guessCount);
    }
  }

  public void incorrectInput() {
    System.out.println ("Incorrect input!");
  }
  public void againstZero(Jar jar) {
    System.out.printf("Your guess must be between 1 and %d!%n", jar.getMaxAmount());
  }
}