import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        String str = "";
        int num = 0;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            str = st.nextToken();

            if(str.equals("push")) {
                num = Integer.parseInt(st.nextToken());
                stack.push(num);

            } else if(str.equals("pop")) {
                if(stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());    //정수를 빼고 출력
                }

            } else if(str.equals("size")) {

                System.out.println(stack.size());

            } else if(str.equals("empty")) {

                if(stack.empty())  {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }

            } else if(str.equals("top")) {

                if(stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peek()); //pop과는 달리 꺼내지는 않음
                }
            }
        }
    }
}
