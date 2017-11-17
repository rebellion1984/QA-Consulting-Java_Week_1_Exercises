package Bareen_Moore_Project;

public class BarrenMooreRunner {

	public static void main(String[] args) {
		
		Player p = new Player();
		Swamp s = new Swamp();
		s.drawGrid();
		
		s.putPlayer(p);
		
	}
}
