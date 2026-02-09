import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();

        //N개의 원 순열 생성
        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while(!queue.isEmpty()) {
            for(int i = 0; i < K - 1; i++) {
                queue.add(queue.poll()); //맨 앞 사람을 뒤로 보냄
            }
            result.add(queue.poll());
        }

        System.out.print("<");

        while(!result.isEmpty()) {
            System.out.print(result.poll());
            if(!result.isEmpty()) {
                System.out.print(", ");
            }
        }

        System.out.print(">");
    }
}
