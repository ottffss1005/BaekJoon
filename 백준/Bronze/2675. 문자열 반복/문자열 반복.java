import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스 수
        int n = Integer.parseInt(br.readLine());

        //반복 횟수 및 문자열 입력
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            //반복 횟수
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            char[] arr = s.toCharArray();

            for(int j=0; j<s.length(); j++) {
                char c = s.charAt(j);
                for(int k=0; k<r; k++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
