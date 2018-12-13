import java.util.Random;
import java.util.ArrayList;

public class Dealer {

	public static String[] deck = {"2c","2s","2h","2d","3c","3s","3h","3d","4c","4s","4h","4d","5c","5s","5h","5d","6c","6s","6h","6d","7c","7s","7h","7d","8c","8s","8h","8d","9c","9s","9h","9d","10c","10s","10h","10d",
			"Jc","Js","Jh","Jd","Qc","Qs","Qh","Qd","Kc","Ks","Kh","Kd","Ac","As","Ah","Ad"};
	
	static Random rand = new Random();
	static ArrayList<String> cards_in_play = new ArrayList();
	
	public Dealer(){
		
	}

	public static String pickcard()
	{

		int card_No = rand.nextInt(52);
		String card_picked = deck[card_No];
		
		while(cards_in_play.contains(card_picked))
		{
			card_No = rand.nextInt(52);
			card_picked = deck[card_No];
		}
		
		cards_in_play.add(card_picked);
		
		return card_picked;
	}
	
	static void deal(Player[] players)
	{
		
		for(Player name: players)
		{
			name.hand[0] = pickcard();
			name.hand[1] = pickcard();
		}
		
	}
	
	public static boolean winCondition()
	{
		boolean condition = false;
		if (true)
		{
			condition = true;
		}
		return condition;
	}
}
