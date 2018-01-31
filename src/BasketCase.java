public class BasketCase {
	/**
	 * Bellevue College CS210
	 * January 2016
	 * W.P. Iverson, instructor
	 * 
	 * Create two Classes that work with test code below:
	 * 		MyBasket will contain an array of Purchase objects
	 * 		So you must create both these Classes
	 * 		Details are provided in a separate document
	 */
	public static void main(String[] args) {
		Purchase item1 = new Purchase("Little stuff", 0, 3.9);
		Purchase item2 = new Purchase("Big things", 7, 5.99);
		Purchase item3 = new Purchase("Big things", 5.99);
		System.out.println(item1); // Little stuff(3.9)
		System.out.println(item2); // Big things(5.99)
		
		MyBasket cart = new MyBasket();
		cart.add(item1);
		cart.add(item2);
		cart.add(item3, 8);
		cart.add(new Purchase("Little stuff",2, 2.9));
		System.out.println(cart.get(0));
		// System.out.println(buck	et);
		// Little stuff(3.9) * 2 purchased = 7.8
		// Big things(5.99) * 7 purchased = 41.93
		// TOTAL COST = 49.73
	}
}