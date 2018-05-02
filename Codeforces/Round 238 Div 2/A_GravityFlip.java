/*
    Codeforces Round #238 Div2
    codeforces.com/contest/405/problem/A
    Junior Training Sheet V 5.6
    1/05/18
 */
import java.io.*;
import java.util.*;
public class A_GravityFlip {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i = 0 ; i < n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i =0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
