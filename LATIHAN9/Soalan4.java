class Soalan4{
	public static void main(String[] args) {

		double celcius, fahrenheit= 98;
		celcius = tukarsuhu(fahrenheit);

		System.out.println("Suhu (f) ="+fahrenheit);
		System.out.println("Suhu (c) ="+celcius);
	}


	static double tukarsuhu(double fahrenheit){

		double tofahrenheit;
		tofahrenheit = (5.0/9.0) * (fahrenheit-32);
		return tofahrenheit;
	}
}