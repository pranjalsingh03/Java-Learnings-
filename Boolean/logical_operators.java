package Boolean;

public class logical_operators {
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;
        boolean b1 = a & b; // Logical AND

        System.out.println("a&b is: " + b1); // false
        System.out.println("a&&b is: " + (a && b)); // false
        System.out.println("a||b is: " + (a || b)); // true
        System.out.println("!(a&&b) is: " + !(a && b)); // true
    }
}