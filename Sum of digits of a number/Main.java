import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int a, x, sum=0;
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      a = n;
      while(a > 0)
      {
        x = a%10;
        sum = sum+x;
        a = a/10;
      }
      System.out.println(sum);
      
	}
}