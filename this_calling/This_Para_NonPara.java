package this_calling;

//this calling statement parameterized and Non-parameterized methods
public class This_Para_NonPara {

	void Sing() {
		this.Dance(44);
		System.out.println("I am singing");
	}
	void Dance(int a) {
		this.Run("running");
		System.out.println("I am dancing");
	}
	void Play() {
		System.out.println("I am playing");
	}
	void Run(String R) {
		this.Play();
		System.out.println("I am running");
	}
	public static void main(String[] args) {
		This_Para_NonPara t1= new This_Para_NonPara();
		t1.Sing();
	}
}
