import java.util.Scanner;

class Soalan3{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Menu pilihan anda:\n\t1.Segiempat\n\t2.Segitiga\n\t3.Bulatan\nMasukan pilihan anda 1,2 atau 3:");
		int nombor = sc.nextInt();
		double luas;
		
			switch (nombor){
			case 1:
			Scanner sc1 = new Scanner(System.in);
		    System.out.print("Masukkan panjang dalam cm:");
		    double nombor1 = sc1.nextDouble();
		    System.out.print("Masukkan lebar dalam cm:");
		    double nombor2 = sc1.nextDouble();
		    luas= nombor1*nombor2;
		    System.out.println("luas Segiempat:"+luas+"cm2");
			break;
			case 2:
			Scanner sc2= new Scanner(System.in);
		    System.out.print("Masukkan tapak dalam cm:");
		    double nombor3 = sc2.nextDouble();
		    System.out.print("Masukkan tinggi dalam cm:");
		    double nombor4 = sc2.nextDouble();
		    luas=0.5*nombor3*nombor4;
		    System.out.println("luas Segitiga:"+luas+"cm");
			break;
			case 3:
		    Scanner sc3= new Scanner(System.in);
		    System.out.print("Masukkan jejari dalam cm:");
		    double nombor5 = sc3.nextDouble();
		    luas=3.142*nombor5*nombor5;
		    System.out.println("luas Segitiga:"+luas+"cm");
			break;
	default: System.out.println("Maaf,salah input");
			
		}
	}
}