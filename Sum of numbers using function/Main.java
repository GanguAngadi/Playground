import java.util.Scanner;
class Main{
  public static int sum_number(int num)
  {
    int sum=0;
    for(int i=1; i<=num; i++)
    {
    sum = sum+i;
    }
      return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = sum_number(n);
      System.out.println(sum);
	}
}