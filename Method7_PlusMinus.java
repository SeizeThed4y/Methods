import java.util.Scanner;
class Main {
  
 
  
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int size = inp.nextInt();
    int[] arr = new int[size];
    for(int i=0 ;i<=size-1;i++)
    {

        arr[i]=inp.nextInt();
    }
    
    plus_minus(arr);
  }//end main
  public static void plus_minus(int [] num) {
		
		int p=0;
		int n=0;
		int z=0;
		for(int i = 0; i < num.length; i++) {
			
			if(num[i] > 0) {
				p++;
			}else if(num[i] < 0) {
				n++;
			}else if(num[i] == 0) {
				z++;
			}
			
		}
		
		// System.out.println("Positives: " + p);
		// System.out.println("Negatives: " + n);
		// System.out.println("Zeros: " + z);
		
		System.out.print("Positives:" + p +", " + "Negatives:" + n +", "+ "Zeros:" + z);
		
	}
  
  
}