import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //상근이가 배달해야 하는 봉지 수
        int N = Integer.parseInt(br.readLine());
        int rest = 0;
        int count = 0;
        boolean can = false;

        for(int i = N/5; i >= 0; i-- ) {
            rest = N - 5 * i;
            if (rest % 3 == 0) {
                can = true;
                count = i + rest/3;
                break;
            }
        }
        if(can) {
            System.out.println(count);
        } else {
            System.out.println("-1");
        }
    }
}
