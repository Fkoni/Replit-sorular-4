package _00Replit;

public class _00ReplitOdev18SayilarinToplami {

public static void main(String[] args) {
		/*
		 * 1'den 100'e kadar olan doğal sayıların 
		 * toplamını bulan programı yazınız.
		 */
				
		int toplam = 0;
		
		for (int sayi = 1; sayi <= 100; sayi ++) {
			
				toplam+=sayi;
			}
		System.out.println("Sayilarin Toplami : " + toplam);
	}

}
