import java.util.HashMap;
import java.util.Scanner;
public class ATM {
private static HashMap<String, Double> ids = new HashMap();
public static void deposit(String id, double amount)
{
		ids.putIfAbsent(id, 0.0);
		ids.put(id, ids.get(id) + amount);
		System.out.println(ids.get(id));
}
private static boolean allNumbers(String check)
{
	for(int i = 0; i < check.length(); i++)
	{
		if(check.charAt(i) != '.' && check.charAt(i) != '0' && check.charAt(i) != '1' && check.charAt(i) != '2' && check.charAt(i) != '3' && check.charAt(i) != '4' && check.charAt(i) !='5' && check.charAt(i) != '6' && check.charAt(i) != '7' && check.charAt(i) != '8' && check.charAt(i) != '9')
		{
			return false;
		}
	}
	return true;
}

public static void main (String [] args)
{
	Scanner keyboard = new Scanner (System.in);
	Scanner keyboardTwo = new Scanner (System.in);
	System.out.println("Enter your account id: ");
	String accountId = keyboard.next();
	System.out.println("Enter the amount you'd like to deposit: ");
	String depositString = keyboardTwo.next();
	while(!allNumbers(depositString) || Double.parseDouble(depositString) < 0)
	{
		System.out.println ("The deposited amount must only be in positive integers\nEnter the amount you'd like to deposit: ");
		depositString = keyboardTwo.next();
	}
	double deposit = Double.parseDouble(depositString);
	ATM.deposit(accountId, deposit);
	keyboard.close();
	keyboardTwo.close();
}
}
