package large.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int a = scan.nextInt();
        System.out.println("enter the 2nd number");
        int b = scan.nextInt();
        System.out.println("enter the 3rd number");
        int c = scan.nextInt();
        System.out.println("all number you gave to find larges ans lower number ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (a > b & c < a) {
            System.out.println(" a is larger number");
            System.out.println(a);
        } else if (b > a & c < b) {
            System.out.println(" b is larger number");
            System.out.println(b);
        } else if (c > a & c > b) {
            System.out.println(" c is larger number");
            System.out.println(c);

        }
    }
}