import java.util.Random;

public class Jar {
  private String itemType;
  private int maxAmount;
  private int randomFromMaxAmount;
  private Random random;

  public String getItemType() {
    return itemType;
  }
  public int getMaxAmount() {
    return maxAmount;
  }
  public int getRandomFromMaxAmount() {
    return randomFromMaxAmount;
  }

  public Jar (String itemType, int maxAmount){
    this.itemType = itemType;
    this.maxAmount = maxAmount;
    random = new Random();
    this.randomFromMaxAmount = random.nextInt(maxAmount) + 1;
  }
}