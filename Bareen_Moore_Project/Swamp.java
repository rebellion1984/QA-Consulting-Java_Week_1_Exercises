package Bareen_Moore_Project;


public class Swamp {
	
	private int a;
	private int b;
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Swamp() {
		
	}
	
	public Swamp(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	public static void drawGrid() 
	{
		int a=15;
		int b=15;
		int i,j;
		
		int [][]  grid = new int[a][b];
		
		for( i=0;i<a;i++)
		{
			for( j=0;j<b;j++)
			{
				grid[i][j]= 0;
			
		System.out.print(grid[i][j]+ " ");
			}
			System.out.print("\n");	
		}
		
	}
	
	public static void putPlayer(Player p) {
		p.setPlayerID(1);
		//p.setPosition([0][1]);
	}
	
}
