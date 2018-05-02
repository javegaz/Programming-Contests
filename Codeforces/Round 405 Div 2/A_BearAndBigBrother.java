/*
    Codeforces Round #405 Div2
    http://codeforces.com/contest/791/problem/A
    Junior Training Sheet V 5.6
    30/04/18
 */
import java.io.*;
import java.util.*;
public class A_BearAndBigBrother {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int ans = 0;
        while(a <=  b){
            a *= 3;
            b *= 2;
           // System.out.println(a + " " + b);
            ans++;
        }
        System.out.println(ans);
    }
}
