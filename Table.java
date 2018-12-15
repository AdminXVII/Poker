import java.util.Arrays;
import java.util.Random;

public class Table {

	public static void main(String[] args) {

		Player younes = new Player("Younes");
		Player andrei = new Player("Andrei");
		Player anthony = new Player("Anthony");

		Player[] players = {younes,andrei,anthony};

		Dealer.deal(players);
		System.out.printf("%s\n%s\n%s\n", younes, andrei, anthony);

		}

}
