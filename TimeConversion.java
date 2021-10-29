import java.util.Scanner;

class Result {
    public static String timeConversion(String s) {
        // Write your code here
        String result = null;
        String[] parts = s.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        int second = Integer.parseInt(parts[2].substring(0,2));
        String format = parts[2].substring(2,4); //  String format = String.valueOf(s.charAt(8)).concat(String.valueOf(s.charAt(9)));

//      if(format.matches("PM")); or  if(format.contains("PM"))
        if(format.compareTo("PM") == 0){
            if(hour < 12){
                result = String.format("%02d:%02d:%02d", hour + 12, minute, second);
            }else {
                result = String.format("%02d:%02d:%02d", hour, minute, second);
            }
        }else if(format.compareTo("AM") == 0){
            if(hour < 12){
                result = String.format("%02d:%02d:%02d", hour, minute, second);
            }else {
                result = String.format("%02d:%02d:%02d", hour - 12, minute, second);
            }
        }
        return result;
    }
}

public class TimeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();

        String result = Result.timeConversion(s);
        System.out.println(result);
    }
}
