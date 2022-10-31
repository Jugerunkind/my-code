import java.util.Scanner;

public class menu{
	public double subTotal;
	public static double kuantiti;
	public static double runningTotal;
	private static double itemPrice;
	static boolean ordering = true;
	static Scanner input = new Scanner (System.in);

	public static void menu(){
		System.out.println("Welcome to Aqil's Burger \n1. Burger (RM5.00) \n2. Fries (RM3.00)\n3. Soda (RM2.50) \n4. Done");
		System.out.print("Your Choice ");

	}

	public static double itemPrice(int pesanan){
		if (pesanan==1) {
			System.out.println("You've ordered a burger");
			itemPrice = 5.00;
		}
		if (pesanan==2) {
			System.out.println("You've ordered a Fries");
			itemPrice = 3.00;
		}

		if (pesanan==3) {
			System.out.println("You've ordered a Soda");
			itemPrice = 2.50;
		}
		kuantiti();
		return itemPrice;
	}
	public static double kuantiti() {
    System.out.println("Enter quantity");       
    double kuantiti = input.nextDouble();
    subTotal(kuantiti, itemPrice);
    return kuantiti;
 }
	public static double subTotal(double kuantiti, double itemPrice) {
    double subTotal = kuantiti*itemPrice;
    System.out.println("Subtotal: "+ subTotal);
    runningTotal += subTotal;
    return subTotal;
}
	public static void done(){
		ordering = false;
		System.out.println("RM "+runningTotal);
		System.out.println("Enjoy your meal");
	}
	public static void main(String[] args) {
		int pilihanMenu;
		int pesanan = 0;
		input = new Scanner(System.in);
		do{
			double runningTotal = 0;
			menu();
			pilihanMenu = input.nextInt();
			switch (pilihanMenu){
				case 1: pesanan=1;
						itemPrice(pesanan);
						break;

				case 2: pesanan=2;
						itemPrice(pesanan);
						break;
						
				case 3: pesanan=3;
						itemPrice(pesanan);
						break;
				
				 case 4:
                done();
                break; 

				default:
						System.out.println("Invalid Option.");

			}
		}
		while (ordering);{
			
		}
	}
}