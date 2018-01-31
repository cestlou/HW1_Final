import java.util.*;
import java.awt.*;

public class Purchase {
  private String itemName;
  public int unitsPurchased;
  private double pricePerUnit;
  
  public Purchase() {
    this("", 0, 0);
  }

  public Purchase(String itemName, double pricePerUnit) {
    this(itemName, 0, pricePerUnit);
  }

  public Purchase(String itemName, int unitsPurchased, double units) {
    this.pricePerUnit = units;
    this.itemName = itemName;
    this.unitsPurchased = unitsPurchased;   
  }
  
// accessor methods 
  public double getPrice() {
    return this.pricePerUnit;
  }

  public String getName() {
    return this.itemName;
  }

  public int getUnitsPurchased() {
    return this.unitsPurchased;
  }
// end accessors

// modifier methods
  public void setPricePerUnit(double units) {
    this.pricePerUnit = units;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public void setUnitsPurchased(int unitsPurchased) {
    this.unitsPurchased = unitsPurchased;
  }
// end modifiers

  
  public double getCost() {
    return unitsPurchased * pricePerUnit;
  }

  public String toString() {
    String s = "";
    return s.format("%s(%s)", itemName, pricePerUnit);
   }
}
