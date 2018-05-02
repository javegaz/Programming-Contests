/*
    Codeforces Round #379 Div2
    http://codeforces.com/contest/734/problem/A
    Junior Training Sheet V 5.6
    30/04/18
 */
import java.io.*;
public class A_AntonAndDanik {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char[] str = s.toCharArray();
        int a = 0;
        int d = 0;
        for(int i = 0; i< str.length; i++){
            if(str[i] == 'A'){
                a++;
            }else{
                d++;
            }
        }
        if(a > d){
            System.out.println("Anton");
        }else if(a < d){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}
