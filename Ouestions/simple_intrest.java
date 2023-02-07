package Ouestions;

import java.util.Scanner;

public class simple_intrest {
    public static void main(String args[]) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("Enter the value of p, r, t: ");
        int p = myNum.nextInt();
        int r = myNum.nextInt();
        int t = myNum.nextInt();
        int si = (p * r * t) / 100;
        System.out.println("Simple intrest is: " + si);

    }
}
