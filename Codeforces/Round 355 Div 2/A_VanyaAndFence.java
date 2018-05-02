/*
    Codeforces Round #355 Div2
    http://codeforces.com/contest/677/problem/A
    Junior Training Sheet V 5.6
    30/04/18
 */
import java.io.*;
import java.util.*;
public class A_VanyaAndFence {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int ans = 0;
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
           if(num > h){
               ans += 2;
           }else{
               ans += 1;
           }
        }
        System.out.println(ans);
    }
}
