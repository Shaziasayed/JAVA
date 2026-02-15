import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("\nPyramid Pattern:");
        printPyramid(n);

        System.out.println("\nRight Triangle Pattern:");
        printRightTriangle(n);

        sc.close();
    }

    // Method 1 - Pyramid
    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Method 2 - Right Triangle
    public static void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
