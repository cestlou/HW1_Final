public class Purchase {
  private String itemName = "";
  public int unitsPurchased = 0;
  private double pricePerUnit = 0.0;

  public Purchase() {
    this("", 0, 0);
  }

  public Purchase(String itemName, double pricePerUnit) {
    this(itemName, 0, pricePerUnit);
  }

  public Purchase(String itemName, int unitsPurchased, double pricePerUnit) {
    this.itemName = itemName;
    this.unitsPurchased = unitsPurchased;
    this.pricePerUnit = pricePerUnit;
  }

  public double getPrice() {
    return this.pricePerUnit;
  }

  public String getName() {
    return this.itemName;
  }

  public int getUnitsPurchased() {
    return this.unitsPurchased;
  }

  public double getCost() {
    return unitsPurchased * pricePerUnit;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public void setUnitsPurchased(int unitsPurchased) {
    this.unitsPurchased = unitsPurchased;
  }

  public String toString() {
    String purchaseInstance = "";
    return purchaseInstance.format("%s(%s)", itemName, pricePerUnit);
   }
}
