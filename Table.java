import java.util.Arrays;
import java.util.Random;

public class Table {
	
	public static void main(String[] args) {
			
		Player younes = new Player("Younes");
		Player andrei = new Player("Andrei");
		Player anthony = new Player("Anthony");
		
		Player[] players = {younes,andrei,anthony};
		
		Dealer.deal(players);
		System.out.println(younes.hand[0] + " " + younes.hand[1] + " " +
				andrei.hand[0] + " " + andrei.hand[1] + " " +
				anthony.hand[0] + " " + anthony.hand[1]);
		
		}
	
}
