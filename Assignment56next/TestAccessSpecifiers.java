package Assignment56next;

public class TestAccessSpecifiers {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.show();
        
        // Trying to access the default and private variables directly will result in an error
        // System.out.println(obj.defaultVar); // Not accessible
        // System.out.println(obj.privateVar); // Not accessible
    }
}