package snackmachineApp;

public class Main
{
	private static void workWithData()
	{
		Customer c1 = new Customer("Jane", 44.25);
		Customer c2 = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocobar = new Snack("Chocolate Bar", 36, 1.0, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.0, food.getId());

		Snack soda = new Snack("Soda", 24, 2.5, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());

		// Customer 1 (Jane) buys 3 of snack 4 (Soda). Print Customer 1 (Jane) Cash on hand. Print quantity of snack 4 (Soda).
		c1.setCash(soda.buySnack(c1.getCash(), 4));

		// Customer 1 (Jane) buys 1 of snack 3 (Pretzel). Print Customer 1 (Jane) Cash on hand. Print quantity of snack 3 (Pretzel).
		c1.setCash(pretzel.buySnack(c1.getCash(), 3));

		// Customer 2 (Bob) buys 2 of snack 4 (Sode). Print Customer 2 (Bob) Cash on Hand. Print quantity of snack 4 (Soda).
		c2.setCash(soda.buySnack(c2.getCash(), 4));

		// Customer 1 (Jane) finds $10. Print Customer 1 (Jane) Cash on Hand.
		c1.setCash(10);

		// Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar). Print Customer 1 (Jane) Cash on Hand. Print quantity of snack 2 (Chocolate Bar).
		c1.setCash(chocobar.buySnack(c1.getCash(), 2));
		// Add 12 more items to snack 3 (Pretzel). Print quantity of snack 3 (Pretzel).
		pretzel.addQuantity(12);

		// Customer 2 (Bob) buys 3 of snack 3 (Pretzel). Print Customer 2 (Bob) Cash on hand. Print quantity of snack 3 (Pretzel).
		c2.setCash(pretzel.buySnack(c1.getCash(), 3));
	}
	public static void main(String[] args)
	{
		workWithData();
	}
}