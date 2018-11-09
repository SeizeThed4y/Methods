import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {
     Scanner inp = new Scanner(System.in);
     
     int num = inp.nextInt();
     
  next3(num);
  
  }
  public static void next3(int num) {

		for (int i = num + 1; i <= num + 3; i++) {

			System.out.print(i + " ");

		}
	}
  
 
 
}