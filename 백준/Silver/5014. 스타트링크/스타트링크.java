import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dist;
    static int F,S,G,U,D;
    static boolean visited[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        F = Integer.parseInt(st.nextToken()); //총 층 수
        S = Integer.parseInt(st.nextToken()); //강호가 있는 층
        G = Integer.parseInt(st.nextToken()); //스타트링크가 있는 층

        U = Integer.parseInt(st.nextToken()); //위로 몇 층
        D = Integer.parseInt(st.nextToken()); //뒤로 몇 층

        dist = new int[F+1];
        visited = new boolean[F+1];

        bfs(F,S,G,U,D);

    }

    static void bfs(int F, int S, int G, int U, int D) {
        Queue<Integer> q = new LinkedList<>();
        visited[S] = true;
        q.add(S);

        while(!q.isEmpty()) {
            int cur = q.poll();

            if(cur == G) {
                System.out.println(dist[cur]);
                return;
            }

            int next1 = cur + U;
            int next2 = cur - D;

            if(next1 >=1 && next1 <= F && !visited[next1]) {
                visited[next1] = true;
                dist[next1] = dist[cur] + 1;
                q.add(next1);
            }

            if(next2 >=1 && next2 <= F && !visited[next2]) {
                visited[next2] = true;
                dist[next2] = dist[cur] + 1;
                q.add(next2);
            }
        }
        System.out.println("use the stairs");
    }
}
