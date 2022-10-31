import java.util.Scanner;

public class Katalaluan {  
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("------------------------------");
    System.out.println(" APLIKASI MENYEMAK KATALALUAN  ");
    System.out.println("------------------------------");  

          
        System.out.print("Masukan kata laluan anda: ");  
        String password = input.next(); 

        int panjang = password.length();
        System.out.println("panjang kata laluan :"+panjang); 

        int mula = password.indexOf("BDG");
        System.out.println("Mula :"+mula); 

        int tamat = password.indexOf("AHC");
        System.out.println("Akhir :"+tamat); 

        String besar = password.toUpperCase();
        System.out.println("Kata laluan :"+besar); 


        if(mula==0 && tamat !=-1 && (tamat-mula)%3==0){
            System.out.println("syarat 1,2 dan 3 dipenuhi");  
            System.out.println("Kata laluan anda sah");
        } else {  
            System.out.println("Kata laluan anda tidak sah");  
        }  
    }  
 
}