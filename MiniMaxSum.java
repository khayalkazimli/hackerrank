import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {


    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int min = arr.get(0);
        int max = arr.get(0);
        long sum = 0;
        for (int i = 1; i < arr.size(); i++) {
            if(min > arr.get(i)){
                min = arr.get(i);
            }
            if(max < arr.get(i)){
                max = arr.get(i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        System.out.printf("%d %d", sum - max, sum - min);
    }
}

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr.add(input.nextInt());
        }

        Result.miniMaxSum(arr);
    }
}
