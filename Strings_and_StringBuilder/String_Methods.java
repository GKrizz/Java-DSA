package Strings_and_StringBuilder;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
        String name="Gobala Krishnan";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println("  Hello  ".trim());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
