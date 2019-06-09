import java.util.Scanner;
import java.lang.Math;
class Main{
  public static int power_num(int m, int n)
  {
    int res = 1;
    while(n>0)
    {
      res = res*m;
      n--;
    }
  return res;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
  int b = in.nextInt();
    int res = power_num(a, b);
    System.out.println(res);
  }
}
