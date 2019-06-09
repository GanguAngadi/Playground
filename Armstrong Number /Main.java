import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      double res = 0;
      int i = 0;
      int rem;
      int a = num;
      while(num != 0)
      {
        num = num/10;
        ++i;
      }
      num = a;
      while(num != 0)
      {
        rem = num%10;
        res = res + Math.pow(rem, i);
        num = num/10;
      }
      if(res == a)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
}
}