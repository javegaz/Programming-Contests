/*
    Codeforces Round #161 Div2
   http://codeforces.com/contest/263/problem/A
    Junior Training Sheet V 5.6
    1/05/18
 */
import java.io.*;
import java.util.*;
public class A_BeautifulMatrix {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] matrix = new int[5][5];
        for(int i = 0; i < 5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int indexI = 0;
        int indexJ = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(matrix[i][j] == 1){
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        indexI++;
        indexJ++;
        int ans = (Math.abs(3 - (indexI)) + Math.abs(3 - (indexJ)));
        System.out.println(ans);
    }
}
