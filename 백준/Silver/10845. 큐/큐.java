import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        String str = "";
        int num = 0;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            str = st.nextToken();

            switch(str) {
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    break;
                case "pop":
                    if(queue.isEmpty()) {
                        System.out.println("-1");
                        break;
                    } else {
                        System.out.println(queue.poll());
                        break;
                    }
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if(queue.isEmpty()) {
                        System.out.println("1");
                        break;
                    } else {
                        System.out.println("0");
                        break;
                    }
                case "front":
                    if(queue.isEmpty()) {
                        System.out.println("-1");
                        break;
                    } else {
                        System.out.println(queue.peek());
                        break;
                    }
                case "back":
                    if(queue.isEmpty()) {
                        System.out.println("-1");
                        break;
                    } else {
                        System.out.println(((LinkedList<Integer>)queue).getLast());
                        break;
                    }
            }
        }
    }
}
