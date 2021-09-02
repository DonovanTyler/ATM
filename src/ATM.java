import java.util.HashMap;
import java.util.Scanner;
public class ATM {
private static HashMap<String, Double> ids = new HashMap();
public static void deposit(String id, double amount)
{
		ids.putIfAbsent(id, 0.0);
		ids.replace(id, ids.get(id) + amount);
		// This is terrible code
}
}
