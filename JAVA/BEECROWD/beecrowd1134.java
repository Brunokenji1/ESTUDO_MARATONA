package BEECROWD;

import java.io.*;

public class beecrowd1134 {

    static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

	public static void main(String[] args) throws IOException {
		int qtdAlccol=0, qtdGasolina=0, qtdDiesel=0;
		
		while(true){
		    int opcao = Integer.parseInt(br.readLine().trim());
		    if(opcao == 4) break;
		    
		    if(opcao == 1) qtdAlccol++;
		    else if(opcao == 2) qtdGasolina++;
		    else if(opcao == 3) qtdDiesel++;
		}
		
		pw.println("MUITO OBRIGADO");
		pw.println("Alcool: " + qtdAlccol);
		pw.println("Gasolina: " + qtdGasolina);
		pw.println("Diesel: " + qtdDiesel);
	    pw.flush();
	}
}
