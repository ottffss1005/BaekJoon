import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = "";

        for(int i = 0; i < N; i++) {
            Stack<Character> stack = new Stack<>();
            str = br.readLine();
            boolean yes = true;

            for(int j = 0; j <str.length(); j++ ) {
                char c = str.charAt(j);

                if(c=='(') {
                    stack.push(c);
                } else if (c==')') {
                    if(stack.isEmpty()) {
                        yes = false;
                    } else {
                        stack.pop();
                    }
                }

            }

            if(stack.isEmpty()) {
            } else {
                yes = false;
            }

            if(yes) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            stack.clear();
        }
    }
}
