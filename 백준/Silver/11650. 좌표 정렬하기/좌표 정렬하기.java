import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //점의 개수
        int N = Integer.parseInt(br.readLine());
        int x;
        int y;

        //ArrayList로 선언
        ArrayList<Point> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            list.add(new Point(x, y));
        }
        Collections.sort(list, (a,b) -> {
            if(a.x != b.x) return Integer.compare(a.x, b.x);
            return Integer.compare(a.y, b.y);
        });

        for(Point p: list) {
            System.out.println(p.x + " " + p.y);
        }
    }
    
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}