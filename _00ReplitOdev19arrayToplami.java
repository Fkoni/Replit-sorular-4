package _00Replit;

public class _00ReplitOdev19arrayToplami {

public static void main(String args[]) {
		/*
		 * input : {1,2,3,4,5,6,7,8};
		 * output: 36
		 */
		
	int arr[]= {1,2,3,4,5,6,7,8};
	
	int arrToplam=0;
	
	for (int toplam :arr) {
		arrToplam=arrToplam+toplam;
	
				}
		System.out.println("Arr elemanları Toplami : " + arrToplam);
	}

}


