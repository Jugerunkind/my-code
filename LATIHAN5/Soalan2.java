import java.util.Scanner;

class Soalan2{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Menu pilihan anda:\n\t1.Nama dan No kp\n\t2.No.telefon\n\t3.Alamat\nsila pilih menu berikut 1,2 atau 3:");
		int nombor = sc.nextInt();
		
		
			switch (nombor){
			case 1:
			Scanner sc1 = new Scanner(System.in);
		    System.out.print("Masukkan nama:");
		    String nama = sc1.nextLine();
		    System.out.print("Masukkan no kp:");
		    String nombor1 = sc1.nextLine();
		    System.out.println("nama anda:"+nama+"\nno kp anda"+nombor1);
			break;
			case 2:
			Scanner sc2 = new Scanner(System.in);
		    System.out.print("Masukkan nombor telefon:");
		    int nombor2 = sc2.nextInt();
		    System.out.println("nombor telefon anda ialah:"+nombor2);
			break;
			case 3:
			Scanner sc3 = new Scanner(System.in);
		    System.out.print("Masukkan alamat:");
		    String nombor3 = sc3.nextLine();
		    System.out.println("alamat anda ialah:"+nombor3);
			break;
	default: System.out.println("Maaf,salah input");
			
		}
	}
}