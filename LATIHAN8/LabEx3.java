import java.util.Scanner;

class LabEx3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			

		int x = 1;

		do{		
			System.out.println("Masukkan jarak dalam kilometer :");
			double km=sc.nextDouble();
			double m=km*1000;
			System.out.println(m+" meter = km x 1000");
			x=x+1;
			

		}while(x<=3);
	}
}