import java.util.HashMap;
import java.util.Scanner;

public class ATM
{
	private static HashMap<String, Double> ids = new HashMap();
	
	public static void deposit(String id, double amount)
	{
		ids.putIfAbsent(id, 0.0);
		ids.replace(id, ids.get(id) + amount);
	}
	
	public static void withdraw(String id, double amount)
	{
		//withdraw money and make sure not over withdraw
	}
	
	public static void checkBalance(String id)
	{
		//return balance or return error if no account exists
	}
}