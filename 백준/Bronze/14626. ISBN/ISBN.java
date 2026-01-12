import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int check = 0;
        int num = 0;

        for(int i=0; i < 13; i++) {
            char ch = str.charAt(i);
            if(ch !='*') {
                num += i %2 == 0? ch - '0': (ch-'0')*3;
            } else {
                check = i;
            }
        }
        
        int answer = 0;
        for(int i=0; i <=9; i++) {
            int sum = num;
            if(check%2 ==0) {
                sum += i;
            } else {
                sum += i*3;
            }
            if(sum %10 == 0){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
