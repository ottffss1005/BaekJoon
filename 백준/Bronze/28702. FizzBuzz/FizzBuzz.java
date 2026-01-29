import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[3];

        arr[0] = br.readLine();
        arr[1]  = br.readLine();
        arr[2]  = br.readLine();

        int num = 0;
        int index = -1;

        for(int i = 0; i < 3; i++) {
            if (isInteger(arr[i])) {
                num = Integer.parseInt(arr[i]);
                index = i;
                break;
            }
        }

        // 1번째가 10이면 2번쨰가 11, 3번쨰가 12니까 4번째 13.
        int next = num + (3 - index);

        System.out.print(isFizzBuzz(next));
    }

    public static boolean isInteger(String s) {
        try{
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String isFizzBuzz(int n) {
        if(n % 15 == 0) return "FizzBuzz";
        if(n % 3 == 0) return "Fizz";
        if(n % 5 == 0) return "Buzz";
        return String.valueOf(n);
    }
}
