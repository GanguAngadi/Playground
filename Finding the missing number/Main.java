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
      int m_v = 0;
      for(int v=1; v<=n; v++)
      {
        boolean is_found = false;
        for(int i=0; i<=n-1; i++)
        {
          if(a[i] == v)
          {
            is_found = true;
            break;
          }
        }
        if(is_found == false)
        { 
          m_v = v;
          break;
        }
      }
      System.out.print(m_v);
            
    }
}