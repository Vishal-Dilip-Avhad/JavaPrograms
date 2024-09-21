package basicprogramming;

public class Non_Static_Methods {
	
	void freekick() {
		System.out.println("this is free kick");
		
	}
	
    
    void cornershot() {
		System.out.println("this is cornershot");
		
		
		  
	}
     void goals(int x, int y) {
    	int z= x+y;
    	System.out.println("Total goals are "+z);
    
    }
    void winningTeam()
    {
    	boolean argentina = true;
    	boolean portugal = false;
    	System.out.println(argentina);
    }
    
    void durationOfgoal() {
    	double firstgoal = 22.46;
    	double seconandGoal = 36.44;
    	System.out.println("duration of 1st goal= "+ firstgoal);
    	System.out.println("duration of 2nd goal= "+seconandGoal);
    }
	public static void main(String[] args) {
		Non_Static_Methods n1= new Non_Static_Methods();
		
		n1.freekick();
		
		
		n1.cornershot();
		n1.goals(4,5);
		n1.durationOfgoal();
		n1.winningTeam();
		
	}

}
