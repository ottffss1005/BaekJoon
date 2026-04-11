import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static boolean visited[];
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dist = new int[100001];
        visited = new boolean[100001];


        bfs(N,K);
    }

    public static void bfs(int x, int target) {
        Queue<Integer> q = new LinkedList<>();
        visited[x] = true;
        int next = 0;
        q.add(x);

        while(!q.isEmpty()) {
            int cur = q.poll();

            if(cur == target) {
                System.out.println(dist[cur]);
                return;
            }

            int next1 = cur - 1;
            int next2 = cur + 1;
            int next3 = cur * 2;

            if(next1 >=0 && next1 <= 100000 && !visited[next1]) {
                visited[next1] = true;
                dist[next1] = dist[cur] + 1;
                q.add(next1);
            }

            if(next2 >=0 && next2 <= 100000 && !visited[next2]) {
                visited[next2] = true;
                dist[next2] = dist[cur] + 1;
                q.add(next2);
            }

            if(next3 >=0 && next3 <= 100000 && !visited[next3]) {
                visited[next3] = true;
                dist[next3] = dist[cur] + 1;
                q.add(next3);
            }

        }
    }
}
