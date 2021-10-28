import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result{

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int first_diagonal = 0, second_diagonal = 0;
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            first_diagonal += arr.get(i).get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            second_diagonal += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(first_diagonal - second_diagonal);
        // or
//        if(first_diagonal < second_diagonal){
//            return (first_diagonal - second_diagonal) * (-1);
//        } else return first_diagonal - second_diagonal;
    }
}


public class DiagonalDifference {
    public static void main(String[] args) {
        int n, arrItem = 0;
        List<List<Integer>> arr = new ArrayList<>();


        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            List<Integer> arrRowItems = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arrRowItems.add(input.nextInt());
            }
            arr.add(arrRowItems);
        }
        int result = Result.diagonalDifference(arr);
        System.out.println(result);

    }
}
