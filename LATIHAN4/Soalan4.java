import java.util.Scanner;

class Soalan4{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("masukan tinggi amin : ");
		int nombor1 = sc.nextInt();
		System.out.print("masukan tinggi ali: ");
		int nombor2 = sc.nextInt();
		


	if (nombor1 > nombor2 )
		System.out.println("amin paling tinggi dengan tinggi "+nombor1 );
	else if (nombor2 > nombor1 ) 
		System.out.println("ali paling tinggi dengan tinggi "+nombor2 );

	}
}