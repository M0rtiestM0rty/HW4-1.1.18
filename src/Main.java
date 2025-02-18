/*
Consider the following recursive function:
Click here to view code image
public static int mystery(int a, int b)
{
if (b == 0) return 0;
if (b % 2 == 0) return mystery(a+a, b/2);
return mystery(a+a, b/2) + a;
}
What are the values of mystery(2, 25) and mystery(3, 11)? Given positive integers a and b,
describe what value mystery(a, b) computes. Answer the same question, but replace + with *
and replace return 0 with return 1.
*/
public class Main
{
        public static int mystery(int a, int b)
        {
            if (b == 0) return 0;
            if (b % 2 == 0) return mystery(a+a, b/2);
            return mystery(a+a, b/2) + a;
        }//end mystery method
    public static void main(String[] args)
    {
        int result = mystery(3, 5);
        System.out.println(result);
    }//end main
}//end class