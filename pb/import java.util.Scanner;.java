import java.util.Scanner;
class Latihan1{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String negeri[]= new String[4] ;
		int hujan[][]=new int[4][6];
		int purata[]=new int[4];

		System.out.println("********************************************");
		System.out.println("\t APLIKASI TABURAN HUJAN (MM)");
		System.out.println("********************************************");
		System.out.println("");

		for (int row=0;row<4 ;row++ ) {
			System.out.print("Masukkan nama negeri :");
			Scanner inputnegeri = new Scanner(System.in);
			negeri[row] = inputnegeri.nextLine(); 

			for (int col=0;col<6 ;col++ ) {
				if (col==0) {
					System.out.print("Masukkan Taburan Hujan Pada Bulan Januari : ");
				}
				if (col==1) {
					System.out.print("Masukkan Taburan Hujan Pada Bulan Februari : ");				}
				if (col==2) {
					System.out.print("Masukkan Taburan Hujan Pada Mac : ");
				}
				if (col==3) {
					System.out.print("Masukkan Taburan Hujan Pada Bulan April : ");
				}
				if (col==4) {
					System.out.print("Masukkan Taburan Hujan Pada Bulan Mei : ");
				}
				if (col==5) {
					System.out.print("Masukkan Taburan Hujan Pada Bulan Jun : ");
				}

				Scanner inputhujan=new Scanner(System.in);
				hujan[row][col]=inputhujan.nextInt();
				purata[row]=purata[row]+hujan[row][col]/6;
			}
			System.out.println("");
		}
		System.out.print("Negeri\tJan\tFeb\tMac\tApril\tMei\tJun\tPurata Taburan Hujan");
		for (int row=0;row<4 ;row++ ) {
			System.out.print("\n"+negeri[row]);
				for (int col=0;col<6 ;col++ ) {
					System.out.print("\t"+hujan[row][col]);
				}
			System.out.print("\t\t"+purata[row]);
		}
	}
}

