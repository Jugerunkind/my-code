import java.util.Scanner;

class Soalan6{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("masukan berat amin : ");
		int nombor1 = sc.nextInt();
		System.out.print("masukan berat ali: ");
		int nombor2 = sc.nextInt();
		


	if (nombor1 < nombor2 )
		System.out.println("amin paling ringan dengan berat "+nombor1 );
	else if (nombor2 < nombor1 ) 
		System.out.println("ali paling ringan dengan berat "+nombor2 );

	}
}