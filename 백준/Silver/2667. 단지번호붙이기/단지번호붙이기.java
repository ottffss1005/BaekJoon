import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[][] map;
    static int N;
    static int[] houses;

    //오름차순
    static ArrayList<Integer> list = new ArrayList<>();

    //2차원 배열
    static boolean[][] visited;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        //map 만들기
        map = new int[N][N];
        visited = new boolean[N][N];

        //단지수 입력
        for(int i=0; i<N; i++) {
            String str = br.readLine();

            for(int j=0; j<N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i=0; i<N; i++) {
            for(int  j=0; j<N; j++) {

                if(map[i][j] == 1 && !visited[i][j]) {
                    bfs(i,j);
                }
            }
        }
        System.out.println(list.size());

        Collections.sort(list);

        for(int n: list) {
            System.out.println(n);
        }
    }

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y] = true;

        //시작점도 집이라서 시작 집 포함
        int count = 1;

        while(!q.isEmpty()) {
            int[] now = q.poll();
            int cx = now[0];
            int cy = now[1];

            for(int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;

                if(map[nx][ny] == 0) continue;

                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    count++;
                    visited[nx][ny] = true;
                    q.add(new int[]{nx,ny});
                }
            }
        }
        list.add(count);

    }
}
