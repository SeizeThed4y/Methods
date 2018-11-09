import java.util.Scanner;

class Main {
  
 
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		
		
		int b;
		int a;
		
		plus(a = scan.nextInt(), b = scan.nextInt());
		
	}
	
	public static void plus(int a, int b){
	     
	    System.out.println("result: " + (a+b));
  }
  
}