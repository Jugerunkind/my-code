import java.util.Scanner;

class LabEx4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan sifir yang dikehendaki :");
		int sfr=sc.nextInt();

		for(int num=1;num<=12;num++){
			int output=num*sfr;
			System.out.println(num+" x "+sfr+" ="+output);
		}
	}
}