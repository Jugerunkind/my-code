import java.util.Scanner;

class LabEx4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x=1;

		do{
			System.out.println("Masukkan jejari bulatan  :");
			int jjr=sc.nextInt();
			double luas=3.142*jjr*jjr;
			System.out.println("Jejari = "+jjr+"\tLuas"+luas);

			x=x+1;
		}while(x<=5);
	}
}