import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] check = new boolean[42]; // 0~41
        int count = 0;

        for(int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            int mod = num % 42;

            if(!check[mod]) {   // 처음 나온 나머지
                check[mod] = true;
                count++;
            }
        }

        System.out.println(count);
    }
}
