package assignments;

class encapsul{
	private int age;
	private String name;
	
	public void  setAge(int age ) {
		this.age = age;
	}
    public void setName(String name) {
		this.name = name;
	}
    public int getAge() {
    	return age;
    }
    public String getName() {
    	return name;
    }
}
public class Assignments74{
	
	public static void main(String[] args) {
		encapsul a1 = new encapsul();
		a1.setAge(5);
		a1.setName("ABCD");
		
		System.out.println(a1.getAge());
		System.out.println(a1.getName());
	}
}