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

		// customer 1 buys 3 of snack 4, Print Customer 1 cash on hand. Print quantity of snack 4
		c1.setCash(soda.buySnack(c1.getCash(), 4));
	}
	public static void main(String[] args)
	{
		workWithData();
	}
}