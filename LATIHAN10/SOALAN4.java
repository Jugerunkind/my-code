import java.util.Scanner;

class SOALAN4{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String nama[]=new String[3];

		for(int i=0;i<3;i++){
			System.out.print("masukkan nama pelajar"+(i+1)+":");
			nama[i]= input.nextLine();
		}
		int tinggi[]=new int[3];

		for(int i=0;i<3;i++){
			System.out.print("masukkan ptinggi pelajar"+(i+1)+":");
			tinggi[i]= input.nextInt();
		}


		for(int i=0;i<3;i++){
			System.out.println("NAMA PELAJAR"+(i+1)+":"+nama[i]);
			System.out.println("NAMA PELAJAR"+(i+1)+":"+tinggi[i]);
		}
	}
}