package Assignment57next;

import Assignment56_AS_subclass.BaseClass;

public class AccessSpecifiersTest {
    public static void main(String[] args) {
        BaseClass obj = new BaseClass();

        // Accessing the public variable
        System.out.println("Accessing members from BaseClass:");
        System.out.println("Public: " + obj.publicVar); // Accessible

        // The following accesses will result in compile-time errors:
        // System.out.println("Protected: " + obj.protectedVar); // Not accessible
        // System.out.println("Default: " + obj.defaultVar); // Not accessible
        // System.out.println("Private: " + obj.privateVar); // Not accessible
    }
}