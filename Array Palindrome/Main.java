import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int i=0; i<=n-1; i++)
      {
        a[i] = in.nextInt();
      }
      int left = 0;
      int right = n-1;
      boolean is_pal = true;
      while(left <= right)
      {
        if(a[left] != a[right])
        {
        is_pal = false;
        break;
      }
      left++;
      right--;
    }
  if(is_pal == true)
  { 
    System.out.print("Yes");
  }
  else
  {
     System.out.print("No");
    }
    }
}