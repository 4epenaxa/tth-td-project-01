import java.util.Scanner;

public class Prompter {
  private Jar jar;
  private Scanner scanner;

  public Prompter() {
    scanner = new Scanner(System.in);
  }

  public void gettingData() {

    System.out.printf("%nLETS PLAY%n-------------%n%nWhat type of item should go in the jar: ");
    String itemType = scanner.nextLine();

    System.out.printf("What is the maximum amount of %s that should go in the jar: ",
            itemType);
    int maxAmount = scanner.nextInt();

    jar = new Jar(itemType, maxAmount);

    System.out.printf("%n---------%n%n%n%n---------%n%n%s is your type%n%d is max amount%n%s is your random%n",
            jar.getItemType(),
            jar.getMaxAmount(),
            jar.getRandomFromMaxAmount());
  }

}