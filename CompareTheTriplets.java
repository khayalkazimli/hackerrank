import java.io.*;
import java.util.*;


class Result {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int result_a = 0;
        int result_b = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if(b.get(i) > a.get(i)){
                result_b += 1;
            }
            if(a.get(i) > b.get(i)){
                result_a += 1;
            }
        }
        result.add(result_a);
        result.add(result_b);

        return result;
    }
}

public class CompareTheTriplets {
    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            a.add(input.nextInt());
        }
        for (int i = 0; i < 3; i++) {
            b.add(input.nextInt());
        }

        List<Integer> result = Result.compareTriplets(a, b);

        System.out.println(result);


    }
}
