import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int s_len = s.length();
        int end = s_len - 1;
        int front = 0;
        boolean is_palindrome = true;
        while(front < end)
        {
            if(s.charAt(front) != s.charAt(end))
            {
                is_palindrome = false;
                break;
            }
            front++;
            end--;
        }
        if(is_palindrome == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    } 
}