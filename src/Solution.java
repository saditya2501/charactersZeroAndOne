//String can be called correct if it consists of characters "0" and "1" and there are no redundant leading zeroes. Here are some examples: "0", "10", "1001".

        import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String str = sc.next();
        System.out.println(solve(str));
        sc.close();
    }
    static String solve(String str)
    {
        return str.equals("0") ? "0" : String.format("1%s", repeat('0', (int) str.chars().filter(ch -> ch == '0').count()));
    }
    static String repeat(char ch, int count)
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++)
        {

            result.append(ch);
        }
        return result.toString();
    }
}


