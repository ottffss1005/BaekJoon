
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==0 && b==0 && c==0) {
                break;
            }

            int[] arr = {a,b,c};
            Arrays.sort(arr);

            a = arr[2];
            b = arr[1];
            c = arr[0];

            //System.out.print(a + " " +b+" "+c+" ");
            if(a*a == b*b + c*c){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }
}
