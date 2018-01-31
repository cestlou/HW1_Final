import java.util.*;
import java.awt.*;

public class MyBasket {
    private Purchase[] cart;
    private int totalPurchasesMade = 0;
    private int countOfPurchases = 0;

    public MyBasket() {
        this.cart = new Purchase[100];
        this.totalPurchasesMade = 0;
    }

    // retrieve the instance of cart desired
    public Purchase get(int x) {
        return cart[x];
    }
    // amount of purchases in cart
    public int length() {
        return this.totalPurchasesMade;
    }

    public void add(Purchase purchase, int y) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                continue;
            }
            else if (purchase == cart[i]) { // if there's somethin in the instance of cart
                if (cart[i].getName().equals(purchase.getName())) { // and that bitch is what we already have
                    purchase.setUnitsPurchased(y); // overwrite the amount of units we've got in there
                }
            }
        }
    }

    public void add(Purchase purchase) {

        for (int j = 0; j < cart.length; j++) {
            if (cart[j] == null) {
                cart[j] = purchase;
                totalPurchasesMade += 1;
                return;
            }
        }
    }

    public double getTotalCost() {
        double sum = 0.0;
        for (int j = 0; j < cart.length; j++) {
            sum += cart[j].getCost();
        }
        return sum;
    }
    public String toString() {
        String nameOf = "";
        double price = 0.0;
        int units = 0;
        double costOf = 0.0;
        String totalCart = "";

        //---------- DESIRED OUTPUT ---------//
        // Little stuff(3.9) * 2 purchased = 7.8
		// Big things(5.99) * 7 purchased = 41.93
		// TOTAL COST = 49.73

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                nameOf = cart[i].getName();
                units = cart[i].getUnitsPurchased();
                price = cart[i].getPrice();
                costOf += cart[i].getCost();

                totalCart += String.format("%s(%s) * %s purchased = %s \n", nameOf, price, units, costOf);

            }
            totalCart += String.format("TOTAL COST = " + this.getTotalCost());
        }
        return totalCart;
   }
}
