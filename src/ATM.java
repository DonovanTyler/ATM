import java.util.*;

public class ATM
{
	private static HashMap<String, Double> ids = new HashMap();
	
	public void deposit(String id, double amount)
	{
		ids.putIfAbsent(id, 0.0);
		ids.replace(id, ids.get(id) + amount);
	}
	
	public void withdraw(String id, double amount)
	{
		double oldValue = ids.get(id);
		
		if (amount <= oldValue)
		{
			double newValue = oldValue - amount;
			ids.put(id, newValue);
		}
	}
	
	public String checkBalance(String id)
	{
		if (ids.containsKey(id))
		{
			double balance = ids.get(id);
			return ("The account's balance is: " + balance);
		}
		else
		{
			return("There is no account associated with the given id.");
		}
	}
}