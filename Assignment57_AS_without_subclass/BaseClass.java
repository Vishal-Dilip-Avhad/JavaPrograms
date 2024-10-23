package Assignment57_AS_without_subclass;

public class BaseClass {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3;  // Default access
    private int privateVar = 4;

    public void display() {
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }
}