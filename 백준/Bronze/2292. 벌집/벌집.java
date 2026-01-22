import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int max = 1;
        int layer = 1;

        while (max < N) {
            max = max + 6* layer;
            layer = layer + 1;
        }

        System.out.println(layer);
    }

}