package Bareen_Moore_Project;

public class Player {
	private int playerID;
	private int [] playerPosition= {0,0};
	
	public Player () {}
	
	public Player (int id, int [] position){
		this.playerID = id;
		this.playerPosition= position;
		
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	
	public void setPosition(int [] pos){
		 this.playerPosition=pos;
		
	 }
	 
	 public int [] getPosition(){
		 return this.playerPosition;
	 }
	 
	 /*String newMoveDirection;
	 
	 public void move(){
			
			switch(newMoveDirection){
			case "n": 
				this.playerPosition[1] += 1;
				break;
			case "s": 
				this.playerPosition[1] -= 1;
				break;
			case "w": 
				this.playerPosition[0] -= 1;
				break;
			case "e": 
				this.playerPosition[0] += 1;
				break;
			}
	 }*/
}
