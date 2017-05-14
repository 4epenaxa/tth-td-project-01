import java.util.Scanner;

public class Prompter {

  public void gettingData() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.printf("%nLETS PLAY%n-------------%n%nWhat type of item should go in the jar: ");
    String itemType = scanner.nextLine();
    
    System.out.printf("What is the maximum amount of %s that should go in the jar: ",
                     itemType);
    String maxAmountAsString = scanner.nextLine();
    int maxAmount = Integer.parseInt(maxAmountAsString);
    
    System.out.printf("%n%n%s is your type%n%d is max amount%n",
                      itemType,
                      maxAmount); 
  }
  
}