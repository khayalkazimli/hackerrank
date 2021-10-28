import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positive = 0, negative = 0, zero = 0;
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) < 0){
                negative += 1;
            }else if(arr.get(i) > 0){
                positive += 1;
            }else zero += 1;
        }
        System.out.printf("%.6f\n",(float)positive / arr.size());
        System.out.printf("%.6f\n",(float)negative / arr.size());
        System.out.printf("%.6f\n",(float)zero / arr.size());
    }

}

public class PlusMinus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] arrTemp = new String[n];

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrTemp[i] = input.next();
            arr.add(Integer.parseInt(arrTemp[i]));
        }

        Result.plusMinus(arr);
    }
}
