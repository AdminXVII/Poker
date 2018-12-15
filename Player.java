
public class Player {

	int chips;
	String name;
  // between 0 and 51
  //  - card & 3 will give you the color number between 0 and 3
  //  - card / 4 will be the number of the card between 0 and 12
	int[] hand = new int[2];

	public Player(String name){

		this.chips = 1000;
		this.name = name;

	}

	void bet(int bet){

		this.chips -= bet;

	}

}
