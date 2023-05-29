
public class Principale {

	public static void main(String[] args) {
		String[][] classi = {  {"Mario", "Pino", "Giulio"},     //0 
				               {"Enzo", "Carlo", "Anna"},       //1
				               {"Franco","Giorgio", "Luca"},    //2
				               {"Lea", "Teo", "Lina"},          //3
				               {"Paolo","Bob", "Mascia"}        //4
				             };
		
		int[][][] numeri = { { {1,2}, {3,4}, {5,6} }, 
				             { {7,8}, {9,10} }, 
				             { {11, 12 } },
				             { { 13,14,15 }, {16}, {17,18 }}
				           };
		
		// System.out.println(classi[2][1]);
		
//		for (int riga=0;riga<classi.length; riga++) {
//			for (int col=0; col<classi[riga].length; col++)
//				System.out.print(classi[riga][col]+" ");
//			System.out.println();
//		}
		
		System.out.println(numeri[1][1][0]);
		System.out.println(numeri[3][2].length);
		
		for (int i=0;i<numeri.length;i++) {
			for(int j=0;j<numeri[i].length;j++) {
				for (int k=0;k<numeri[i][j].length;k++) {
					System.out.println(numeri[i][j][k]);
				}
			}
		}
	}

}
