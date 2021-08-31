import java.util.HashMap;
public class ATM {
	private HashMap<String, Double> ids;
public void deposit(String id, double amount)
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
}
