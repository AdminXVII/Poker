import java.util.Random;
import java.util.ArrayList;

public class Dealer {

	static Random rand = new Random();
	static ArrayList<Integer> cards_in_play = new ArrayList<Integer>();

	public Dealer(){

	}

	public static int pickcard()
	{

		int card_picked;

		do
		{
			card_picked = rand.nextInt(52);
		} while(cards_in_play.contains(card_picked));

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
