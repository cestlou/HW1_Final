import java.util.*;
import java.awt.*;

public class MyBasket {
    private Purchase[] cart;
    private int purchasesMade;

    public MyBasket() {
        this.cart = new Purchase[100];
        this.purchasesMade = 0;
    }

    public void add(Purchase purchase, int y) {
        for (int i = 0; i < cart.length; i++) {
           if (cart[i] != null) { // if there's somethin in the instance of cart
                if (cart[i].getName().equals(purchase.getName())) { // and that bitch is what we already have
                    purchase.setUnitsPurchased(y); // overwrite it 
                }
            }
        }
        // for (int i = 0; i < cart.length; i++) {
        //     if (cart[i].getName().equals("")) {
        //         break;
        //     } else if (cart[i].getName().equals(purchase.getName())) {
        //         System.out.println("instance " + cart[i]);
        //         System.out.println("howdy");
        //     }
        // }
        // for (int j = 0; j < cart.length; j++) {
        //     if (cart[j] == null) {
        //         purchase.setUnitsPurchased(y);
        //         cart[j] = purchase;
        //         return;
        //     }
        // }

    }
    
    public void add(Purchase purchase) {
        
        for (int j = 0; j < cart.length; j++) {
            if (cart[j] == null) {
                cart[j] = purchase;
                return;
            }
        }
    }

    public double getTotalCost() {
        double sum = 0;
        for (int j = 0; j < cart.length; j++) {
            int units = cart[j].getUnitsPurchased();
            double price = cart[j].getPrice();
            sum += units * price;
        }
        return sum;
    } 

    // accessor methods
    public int length() {
        return this.purchasesMade;
    }

    public Purchase get(int x) {
        return cart[x];
    }
    // end accessors

    public String toString() {
        String nameOf = "";
        int units = 0;
        double price = 0.0;
        double sumOfItemCost = 0.0;
        double sumOfTotalCost = 0.0;
        String theItems = "";
        String theFinalPrice = "";


        // Little stuff(3.9) * 2 purchased = 7.8
		// Big things(5.99) * 7 purchased = 41.93
		// TOTAL COST = 49.73
        
        for (int i=0; i < cart.length; i++) {
            System.out.println(cart[i].getUnitsPurchased());
            if (cart[i] != null) {
                nameOf = cart[i].getName();
                units = cart[i].getUnitsPurchased();
                price = cart[i].getPrice();
                sumOfItemCost = 0; //units * price;
                sumOfTotalCost += 0; //sumOfItemCost;
                theItems += String.format("%s(%s) * %s purchased = %s \n", nameOf, price, units, sumOfItemCost);
            }
        }
        return theItems;
   }
}

