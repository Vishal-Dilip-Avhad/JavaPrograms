package basicprogramming;

public class Continue {

	public static void main(String[] args) {
		
		for(int i=2; i<=100; i++) {
		 if(i%10==0){
				continue;
			}
		 System.out.println(i);
		}

	}

}
