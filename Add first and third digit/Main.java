import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int fd= n/100;
      int ld= n%10;
      int s= fd+ld;
      System.out.println(s);
	}
}