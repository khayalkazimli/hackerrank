import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;


public class SimpleArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int result = 0;

        for (int i = 0; i < ar.size(); i++) {
            result += ar.get(i);
        }
        return result;
    }
}

class Solution {
    public static void main(String[] args) throws IOException {

        int n;
        List<Integer> ar = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = input.nextInt();
        System.out.print("Enter values : ");
        for (int i = 0; i < n; i++) {
            ar.add(input.nextInt());
        }

        int result = SimpleArraySum.simpleArraySum(ar);
        System.out.println(result);
    }
}

