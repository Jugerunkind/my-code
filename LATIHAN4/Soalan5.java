import java.util.Scanner;

class Soalan4{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("masukan nombor : ");
		int nombor1 = sc.nextInt();

		


	if (nombor1 % 4 == 0 )
		System.out.println("boleh dibahagikan dengan 4 " );
	else 
		System.out.println("tidak boleh dibahagikan dengan 4 " );

	}
}