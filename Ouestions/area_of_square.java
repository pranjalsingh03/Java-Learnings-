package Ouestions;

import java.util.Scanner;

public class area_of_square {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int area = a*a;
        System.out.println("Area of square is: " + area);
    }
}
