import java.io.IOException;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] size = new int[6];
        for(int i =0; i<6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int bundles = 0;

        for(int i =0; i<6; i++) {
            bundles = bundles + ((size[i]+T-1)/T);
        }
        int penSet = people/P;
        int penEach = people%P;

        System.out.println(bundles);
        System.out.println(penSet+" "+penEach);
    }
}