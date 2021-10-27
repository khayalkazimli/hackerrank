import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long result = 0;

        for (int i = 0; i < ar.size(); i++) {
            result += ar.get(i);
        }
        return result;
    }
}

public class AVeryBigSum {
    public static void main(String[] args) throws IOException {

        int n;
        List<Long> ar = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
           ar.add(input.nextLong());
        }

        long result = Result.aVeryBigSum(ar);

        System.out.println(result);


    }
}
