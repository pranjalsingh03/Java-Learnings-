package Boolean;

public class logical_operators {
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;
        boolean b1 = a & b; // Logical AND
        boolean b3 = a | b; // Logical OR
        boolean b4 = a ^ b; // Logical XOR
        boolean b5 = !b; // Logical NOT
        System.out.println("a is: " + a); // true
        System.out.println("b is: " + b); // false
        System.out.println("!b is: " + b5); // false
        System.out.println("a^b is: " + b4); // true
        System.out.println("a|b is: " + b3); // true
        System.out.println("a&b is: " + b1); // false
        System.out.println("a&&b is: " + (a && b)); // false
        System.out.println("a||b is: " + (a || b)); // true
        System.out.println("!(a&&b) is: " + !(a && b)); // true
    }
}