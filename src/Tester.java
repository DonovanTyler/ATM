public class Tester
{
	public static void main (String [] args)
	{
		ATM atm = new ATM ();
		
		atm.deposit("Winfrey", 25159684372.43);
		atm.deposit("Bezos", 193495330293.43);
		atm.deposit("Bezos", 20394353.35);
		atm.withdraw("Bezos", 3593293.66);
		atm.deposit("MrTheiss",64033.55);
		atm.withdraw("MrTheiss", 443964.46);
		System.out.println(atm.checkBalance("Bezos"));
		System.out.println(atm.checkBalance("Winfrey"));
		System.out.println(atm.checkBalance("YoMama"));
		System.out.println(atm.checkBalance("MrTheiss"));
	}
}