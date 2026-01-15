import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int m = 1; m<N; m++) {

            //각 숫자 자릿수 구하기
            String strNum = Integer.toString(m);
            int[] arrNum = new int[strNum.length()];
            for(int i=0; i<strNum.length(); i++) {
                arrNum[i] = strNum.charAt(i) - '0';
            }
            int sum =m;
            for(int i=0; i<arrNum.length; i++) {
                sum = sum+arrNum[i];
            }

            if(sum == N){
                System.out.println(m);
                return;
            }
        }
        System.out.println(0);
    }
}
