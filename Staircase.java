import java.util.Scanner;

class Result {

    public static void staircase(int n) {
        // Write your code here
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= k; j++) {
                System.out.print("#");
            }
            System.out.println();
            k++;
        }
    }
}

public class Staircase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Result.staircase(n);
    }
}
