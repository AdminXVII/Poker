
public class Player {
	
	int chips;
	String name;
	String[] hand = new String[2];
	
	public Player(String name,int chips){
		
		this.chips = chips;
		this.name = name;
		
	}
	
	void bet(int bet){
		
		this.chips -= bet;
		
	}

}
