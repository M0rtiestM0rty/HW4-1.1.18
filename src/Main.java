public class Main
{
        public static int mystery(int a, int b)
        {
            if (b == 0) return 0;
            if (b % 2 == 0) return mystery(a+a, b/2);
            return mystery(a+a, b/2) + a;
        }
    public static void main(String[] args)
    {
        int result = mystery(3, 5);
        System.out.println(result);
    }
}