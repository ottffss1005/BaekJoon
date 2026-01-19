import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //온라인 저지 회원 수 및 정보
        int N = Integer.parseInt(br.readLine());
        int age = 0;
        String str;

        ArrayList<StringPoint> list = new ArrayList<>();

        //각 회원의 나이와 이름
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            age = Integer.parseInt(st.nextToken());
            str = st.nextToken();

            list.add(new StringPoint(age, str));
        }
        //정렬
        list.sort((a,b) -> {
            if(a.x != b.x) return Integer.compare(a.x, b.x);
            return 0;
        });

        //출력
        for(StringPoint p: list) {
            System.out.println(p.x + " " + p.st);
        }
    }
}

class StringPoint {
    int x;
    String st;

    StringPoint(int x, String st) {
        this.x = x;
        this.st = st;
    }
}