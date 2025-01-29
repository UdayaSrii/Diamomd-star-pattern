import java.util.Scanner;
public class DiamondStarPattern {
    // Create a method to print the diamond star pattern
    public static void main(String[] args) {
        // create a scanner object to get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for half of the diamond: ");
        int n = sc.nextInt();
        // close the scanner object
        sc.close();
        // The loop will print the upper half of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // The loop will print the lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
