import java.util.Scanner;

class LabEx4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan panjang kiub : ");
		int no=sc.nextInt();

		int num = 1;

		while(num<=1){
			int no1=no*no;
			System.out.println("Isipadu panjang = "+no1);
			num=num+1;
		}

	}
}