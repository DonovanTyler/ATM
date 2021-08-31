import java.util.HashMap;
import java.util.Scanner;
public class ATM {
private static HashMap<String, Double> ids;
public static void deposit(String id, double amount)
{
	if(!ids.containsKey(id))
	{
		ids.put(id, amount);
	}
	else
	{
		ids.put(id, ids.get(id) + amount);
	}
}

public static void main (String [] args)
{
	Scanner keyboard = new Scanner (System.in);
	Scanner keyboardTwo = new Scanner (System.in);
	System.out.println("Enter your account id: ");
	String accountId = keyboard.next();
	System.out.println("Enter the amount you'd like to deposit: ");
	int deposit = Integer.parseInt(keyboardTwo.next());
	while (deposit < 0)
	{
		System.out.println("Not a valid amount.\nEnter a new amount: ");
	deposit = Integer.parseInt(keyboardTwo.next());
	}
	ATM.deposit(accountId, deposit);
	keyboard.close();
	keyboardTwo.close();
}
}
