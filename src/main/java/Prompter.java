import java.util.Scanner;

public class Prompter {
  private Jar jar;
  Scanner scanner = new Scanner(System.in);

  public void gettingData() {
    
    System.out.printf("%nLETS PLAY%n-------------%n%nWhat type of item should go in the jar: ");
    String itemType = scanner.nextLine();
    
    System.out.printf("What is the maximum amount of %s that should go in the jar: ",
                     itemType);
    String maxAmountAsString = scanner.nextLine();
    int maxAmount = Integer.parseInt(maxAmountAsString);
    
    jar = new Jar(itemType, maxAmount);
    
    System.out.printf("%n---------%n%n%n%n---------%n%n%s is your type%n%d is max amount%n",
                      jar.getItemType(),
                      jar.getMaxAmount());
  }
  
}