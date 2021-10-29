import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        // System.out.println(candles);
        int max = 0, count = 0;
        for (int i = 1; i < candles.size(); i++) {
            if(max < candles.get(i)){
                max = candles.get(i);
            }
        }
        for (int i = 0; i < candles.size(); i++) {
            if(max == candles.get(i)){
                count++;
            }
        }
        return count;
    }
}
public class BirthdayCakeCandles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            candles.add(input.nextInt());
        }
        int result = Result.birthdayCakeCandles(candles);
        System.out.println(result);
    }
}
