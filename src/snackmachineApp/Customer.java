package snackmachineApp

public class Customer
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash)
	{
		maxId++
		this.id = maxId;
		this.name = name;
		this.cash = cash;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCash()
	{
		return cash;
	}

	public void setCash(double cash)
	{
		double cashOnHand = this.cash;
		this.cash = cash;
		System.out.println(this.name + " had $ " + cashOnHand + "and now has $ " + cash + "left \n");
	}
}