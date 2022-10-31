class Soalan3{
	public static void main(String[] args) {
		double tapak = 6.5, tinggi= 5.5, hasil;
		hasil = jumlah(tapak, tinggi);

        line();
		System.out.println("tapak ="+tapak);
		
		System.out.println("tinggi ="+tinggi);
		System.out.println("Hasil tambah ="+hasil);
		line();
	}

	static void line(){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
	}

	static double jumlah(double tapak, double tinggi){

		double total;
		total = tapak * tinggi;
		return total;
	}
}