import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
int n = in.nextInt();
int l[] = new int[n];
for(int index = 0; index < n; index++)
{
l[index] = in.nextInt();
}
perfect_batch(l, n);
}

public static void perfect_batch(int l[], int n)
{
boolean is_perfect_batch = true;
int batch_sum = l[0] + l[1] + l[2];
for(int index = 3; index <= n-1 ; index = index + 3) {
int curr_batch_sum = l[index] + l[index + 1] + l[index + 2];
if(curr_batch_sum != batch_sum)
{
is_perfect_batch = false;
}
}
if(is_perfect_batch == true)
{
System.out.println("Perfect Batch");
}
else
{
System.out.println("Not a Perfect Batch");
}
  }
}