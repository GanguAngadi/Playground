import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[100];
        int i, j;
        for(i=0; i<N; i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print(subsequence( arr, N ) );
    }
    public static int subsequence( int arr[], int n )
    {
        int r_sum, max_sum_sub, i;
  
 	    r_sum = arr[0];
  	    max_sum_sub = arr[0];
  	    for(i = 1; i < n; i++)
        {
            if(arr[i] > arr[i-1])
            {
                r_sum += arr[i];
            }
            else 
            {
                r_sum = arr[i];
            }
            if(r_sum > max_sum_sub)
            {
                max_sum_sub = r_sum;
            }
        }
        return max_sum_sub;

  }
}