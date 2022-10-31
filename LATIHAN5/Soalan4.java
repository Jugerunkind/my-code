import java.util.Scanner;

class Soalan4{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Menu pilihan anda:\n\t1.Kentang goreng(RM3.50)\n\t2.Burger ayam(RM2.50)\n\t3.Ayam goreng(RM5.50)\nMasukan pilihan anda 1,2 atau 3:");
		int nombor = sc.nextInt();
		double jumlah;
		
			switch (nombor){
			case 1:
			Scanner sc1 = new Scanner(System.in);
		    System.out.print("Masukkan kuantiti:");
		    double nombor1 = sc1.nextDouble();
		    jumlah=3.50*nombor1;
		    System.out.println("jumlah yang dikenakan RM:"+jumlah);
			break;
			case 2:
		    Scanner sc2 = new Scanner(System.in);
		    System.out.print("Masukkan kuantiti:");
		    double nombor2 = sc2.nextDouble();
		    jumlah=2.50*nombor2;
		    System.out.println("jumlah yang dikenakan RM:"+jumlah);
			break;
			case 3:
		    Scanner sc3 = new Scanner(System.in);
		    System.out.print("Masukkan kuantiti:");
		    double nombor3 = sc3.nextDouble();
		    jumlah=5.50*nombor3;
		    System.out.println("jumlah yang dikenakan RM:"+jumlah);
			break;
	default: System.out.println("Maaf,salah input");
			
		}
	}
}