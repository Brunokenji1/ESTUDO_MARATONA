package codigo;
import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    static final int INF = Integer.MAX_VALUE / 2;
    static final long LINF = Long.MAX_VALUE / 2;
    static final long MOD = 1_000_000_007L / 2;

    public static void main(String[] args) throws IOException{
        int T = nextInt();
        while(T-- > 0){
            solve();
        }
        pw.flush();
    }

    static void solve() throws IOException{
        int n = nextInt();
        pw.println(n);
    }

    static int nextInt() throws IOException{
        return Integer.parseInt(nextToken());
    }
    
    static long nextLong() throws IOException{
        return Long.parseLong(nextToken());
    }

    static double nextDouble() throws IOException{
        return Double.parseDouble(nextToken());
    }

    static StringTokenizer _st = new StringTokenizer("");
    
    static String nextToken() throws IOException{
        while(!_st.hasMoreTokens())
            _st = new StringTokenizer(br.readLine());
        return _st.nextToken();
    }

    static long mdc(long a, long b){
        return b==0 ? a : mdc(b, a%b);
    }

    static long mmc(long a, long b){
        return a / mdc(a, b)*b;
    }

    static long potMod(long base, long exp, long mod){
        long res = 1;
        base %= mod;
        for(; exp>0; exp>>=1){
            if((exp & 1) == 1){
                res = res * base % mod;
            }
            base = base * base % mod;  
        }
        return res;
    }
}
