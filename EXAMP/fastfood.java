import java.util.Scanner;

class fastfood{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int pilihan;
		char teruskan;

		do{
			menu();
			System.out.print("Your choice : ");
			pilihan = input.nextInt();

			switch(pilihan){
				case 1 : double burger = 3;
					     break;
				case 2 : fries();
					     break;
				case 3 : soda();
						 break; 
				case 4 : runningTotal();
						 break;
				default: System.out.println("Kesilapan");

			}
			
		}while(pilihan!=4);

}

	private static void menu(){
		System.out.println("Welcome to Aqil's Burger");
		System.out.println("1. Burger (RM5.00)");
		System.out.println("2. Fries (RM3.00)");
		System.out.println("3. Soda (RM2.50)");
		System.out.println("4. Done");
		System.out.println("");
	}

	public static void subtotal(){

	}

	public static void done(){

	}
	
}