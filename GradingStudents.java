import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> gradeResult = new ArrayList<>();
        int result;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 38) {
                gradeResult.add(grades.get(i));
            } else {
                result = grades.get(i);
                while (result % 5 > 2) {
                    result++;
                }
                gradeResult.add(result);
            }
        }
        return gradeResult;
    }
}

public class GradingStudents {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int gradesCount = input.nextInt();

        for (int i = 0; i < gradesCount; i++) {
            grades.add(input.nextInt());
        }
        System.out.println(Result.gradingStudents(grades));

    }
}
