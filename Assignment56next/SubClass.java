package Assignment56next;

import Assignment56_AS_subclass.BaseClass;

public class SubClass extends BaseClass {
    public void show() {
        System.out.println("Accessing variables from BaseClass:");
        System.out.println("Public: " + publicVar); // Accessible
        System.out.println("Protected: " + protectedVar); // Accessible
        // System.out.println("Default: " + defaultVar); // Not accessible
        // System.out.println("Private: " + privateVar); // Not accessible
    }
}