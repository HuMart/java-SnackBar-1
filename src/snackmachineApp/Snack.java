package snackmachineApp;

public class Snack 
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double price;
	private int vmId;

	public Snack(String name, int quantity, double price, int vendingMachineId)
	{
		maxId++;
		this.id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.vmId = vmId;
	}
	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setVmId(int vmId)
	{
		this.vmId= vmId;
	}

	public int getVmId()
	{
		return vmId;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void addQuantity(int quantity)
	{
		if(quantity > 0)
		{
			this.quantity += quantity;
		} 
		else 
		{
			System.out.println("Need to restock");
		}
	}

	public double buySnack(double moneyIn, int numOfItem)
	{
		if(numOfItem <= this.quantity && moneyIn >= this.price) 
		{
			System.out.println("Your total cost is $ " + getTotalPrice(numOfItem));
			this.quantity = this.quantity - numOfItem;
			System.out.println(this.quantity + " of this " + this.name + "left in stock \n");
			return moneyIn - getTotalPrice(numOfItem);
		}
		else
		{
			System.out.println("Not money enough");
		}
		return moneyIn;
	}

	public double getTotalPrice(int numOfItem)
	{
		return numOfItem * this.price;
	}



}