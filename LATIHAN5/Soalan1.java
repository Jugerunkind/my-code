import java.util.Scanner;

class Soalan1{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("masukan kod : ");
		int nombor = sc.nextInt();
		
		
			switch (nombor){
			case 1:System.out.println("Tempat pertama dalam perlumbaan");
			break;
			case 2:System.out.println("Tempat kedua dalam perlumbaan");
			break;
			case 3:System.out.println("Tempat ketiga dalam perlumbaan");
			break;
	default: System.out.println("Maaf,salah input");
			
		}
	}
}