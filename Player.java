
public class Player {
	
	int chips;
	String name;
	String[] hand = new String[2];
	
	public Player(String name){
		
		this.chips = 1000;
		this.name = name;
		
	}
	
	void bet(int bet){
		
		this.chips -= bet;
		
	}

}
