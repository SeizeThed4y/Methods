import java.util.Scanner;
class Main {
  
  public static void sign(int n)
  {
    if(n > 0){
      System.out.println("1");
      
    }else if(n < 0){
      System.out.println("-1");
    }else{
      System.out.println("0");
    }
    
  }//end sign
  
  public static void main(String[] args) {
     Scanner inp = new Scanner(System.in);
     int n = inp.nextInt();
    
    sign(n);
  }
}