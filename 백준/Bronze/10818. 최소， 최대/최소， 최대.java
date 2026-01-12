import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int array[] = new int[N];

        for(int i =0; i<array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int min = array[0];
        int max = array[0];

        for(int i = 0; i<array.length;i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        System.out.println(min + " " + max);
    }
}
