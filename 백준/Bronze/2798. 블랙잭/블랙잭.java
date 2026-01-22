import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //카드의 개수
        int M = Integer.parseInt(st.nextToken()); //카드 합 제한
        int[] arr = new int[N];

        StringTokenizer sr = new StringTokenizer(br.readLine());
        //카드 값 입력
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(sr.nextToken());
        }

        //카드 배열 중 3개 합이 M을 넘지 않는 3장의 합 찾기
        int max = 0;
        int sum = 0;

        for (int i = 0; i < N-2; i++) {
            for(int j = i+1; j < N - 1; j++) {
                for(int k = j + 1; k < N; k++) {
                    sum = arr[i] + arr[j] + arr[k];

                    if(sum <= M && sum > max) {
                        max = sum;
                    }
                }
            }
        }

        System.out.print(max);
    }
}