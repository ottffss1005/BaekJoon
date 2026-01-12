import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int power = Integer.highestOneBit(N);

        int answer;
        if (N == power) {
            answer = N;
        } else {
            answer = 2 * (N - power);
        }

        System.out.println(answer);
    }
}