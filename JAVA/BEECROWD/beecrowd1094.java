package BEECROWD;

import java.io.*;
import java.util.*;
public class beecrowd1094 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException{
        int qtdC=0, qtdR=0, qtdS=0, total=0;
        int T = nextInt();
        while(T-- > 0){
            solve();
        }
        pw.flush();
    }

    static void solve() throws IOException{
        
    }
    static int nextInt() throws IOException{
        return Integer.parseInt(nextToken());
    }
    static StringTokenizer _st = new StringTokenizer("");
    
    static String nextToken() throws IOException{
        while(!_st.hasMoreTokens())
            _st = new StringTokenizer(br.readLine());
        return _st.nextToken();
    }
}
