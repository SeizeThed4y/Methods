import java.util.Scanner;
class Main {
  
  public static void cube()
  {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    System.out.println(Math.pow(num,3));
  }//end cube
  
  public static void main(String[] args) {
    
    cube();
   
  }
}