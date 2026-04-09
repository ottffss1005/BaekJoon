import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static int n,x,y,m;
    static int[] dist;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); //전체 사람 수

        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken()); //촌 수 계산하는 두 사람 번호
        y = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine()); //관계의 개수 (간선)

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        dist = new int[n+1];

        //그래프 크기 주의
        for(int i=0; i<=n; i++) {
            graph[i] = new ArrayList<>();
        }

        //간선 입력
        for(int i=0; i<m; i++) {
            String[] str = br.readLine().split(" ");

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            graph[a].add(b);
            graph[b].add(a);
        }
        bfs(x);

        if(!visited[y]) {
            System.out.println(-1);
        } else {
            System.out.println(dist[y]);
        }
    }

    public static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        visited[x] = true;
        q.add(x);

        while(!q.isEmpty()) {
            int cur = q.poll();

            for(int next: graph[cur]) {
                if(!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[cur] + 1;
                    q.add(next);
                }
            }
        }

    }

}
