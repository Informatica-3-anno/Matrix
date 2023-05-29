import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	private static int inseriti=0;
	private static String[][] rub =new String[10][2];
	
	public static void bubbleSort(String[][] v) {
		boolean scambio;
		int j = inseriti - 1;
		do {
			scambio = false;
			for (int i = 0; i < j; i++) {
				String[] temp;
				if (v[i][0].compareTo(v[i + 1][0])>0) {
					temp = v[i];
					v[i] = v[i + 1];
					v[i + 1] = temp;
					scambio = true;
				}
			} // chiude il for
			j = j - 1;
		} while (scambio == true);
	}
	
	public static void stampa() {
		System.out.println("[Nome, Tel]");
		for (int i=0;i<inseriti;i++) {
			
			System.out.print(rub[i][0]);
			System.out.println(", "+rub[i][1]);
		}
		
		
		
		
	}
	
		
	public static boolean inserisci(String nome, String telefono) {
		boolean esito=true;
		if (inseriti<rub.length) {
			rub[inseriti][0]=nome;
			rub[inseriti][1]=telefono;
			inseriti++;
		} else esito=false;
		return esito;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Inserisci un nome e un numero di telefono");
//		String n=sc.next();
//		String t=sc.next();
//		sc.nextLine();
		inserisci("Matio","1234");
		inserisci("Anna","567");
		inserisci("Giorgio","89");
		bubbleSort(rub);
		stampa();

	}

}
