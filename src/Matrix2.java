
public class Matrix2 {

	public static void riempi(int[][] n) {
		int val=1;
		
		for( int i=0; i<n.length;i++) {
			for (int j=0;j<n[i].length;j++) {
				n[j][i]=val++;
			}
		}
		
		
	}
	
	public static void stampa(int[][] n) {
		for (int riga=0;riga<n.length; riga++) {
			for (int col=0; col<n[riga].length; col++)
				System.out.print(n[riga][col]+" ");
		System.out.println();
		}
	}
	
	public static int sommaDiag(int[][] n) {
		int somma=0;
		for (int j=0;j<n.length;j++) {
			somma+=n[j][j];
			System.out.print(n[j][j]+" ");
		}
		System.out.println();
		return somma;
	}
	
	public static int sommaDiag2(int[][] n) {
		int somma=0;
		for (int j=n.length-1;j>=0;j--) {
			somma+=n[(n.length-1-j)][j];
			System.out.print(n[(n.length-1-j)][j]+" ");
		}
		System.out.println();
		return somma;
	}
	public static void main(String[] args) {
		int[][] n=new int[6][6];
		
		riempi(n);
		stampa(n);
		System.out.println();
		System.out.println("Diag1 "+sommaDiag(n));
		System.out.println("Diag2 "+sommaDiag2(n));

	}

}
