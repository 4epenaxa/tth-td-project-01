import java.util.Random;

public class Jar {
  private String itemType;
  private int maxAmount;
  private int randomFromMaxAmount;

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
    this.randomFromMaxAmount = new Random().nextInt(maxAmount) + 1;
  }
}