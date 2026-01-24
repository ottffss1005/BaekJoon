import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";

        while(true) {
            str = br.readLine();

            if (str.equals("0")) break;

            boolean answer = true;

            for(int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    answer = false;
                    break;
                }
            }

            if(answer) {
                System.out.println("yes");
            } else{
                System.out.println("no");
            }
//            char[] numChar = new char[str.length()];
//            numChar = str.toCharArray();
//
//            for (int i = 0; i < str.length(); i++) {
//                if (numChar[i] == numChar[str.length() - i]) {
//                    answer = true;
//                } else {
//                    answer = false;
//                }
//            }
//
//            if(answer) {
//                System.out.println("yes");
//            } else{
//                System.out.println("no");
//            }
        }
    }
}
