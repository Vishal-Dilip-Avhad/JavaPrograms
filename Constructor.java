package basicprogramming;

public class Constructor {
 public static void main(String[] args) {
	
	new Constructor();
	
	new Constructor(-127, 129);
	new Constructor(568,9650);
}
 Constructor(){
	 int x=6;
	 int y=7;
	 int z = x+y;
	 System.out.println("addition is-->"+z);
 }

 Constructor(byte v , short w){
	 short z=(short) (w+v);
	 System.out.println(z);
 }
   Constructor(int a, int b){
	   int c = a+b;
	   System.out.println(c);
   }
  }
