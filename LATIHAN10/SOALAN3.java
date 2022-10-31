import java.util.Scanner;

class SOALAN3{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int pendapatan[]=new int[4];

		for(int i=0;i<4;i++){
			System.out.print("masukkan pendapatan family"+(i+1)+":");
			pendapatan[i]= input.nextInt();
		}

		for(int i=0;i<4;i++){
			System.out.println("Family"+(i+1)+"="+pendapatan[i]);
		}
	}
}