package basicprogramming;

public class Continue_keyword {

	public static void main(String[] args) {
	
		for(int i=0; i<=10; i++) {
			if( i % 2 == 0) {
				continue;
			}
			System.out.println(i);   //this will print odd number
		}
		
		for(int i=0; i<=10; i++) {
			if( i % 2 != 0) {
				continue;
			}
			System.out.println(i);   //this will print even number
		}
		
	}

}
