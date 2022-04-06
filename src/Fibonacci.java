public class Fibonacci
{
    public static int max = 0;
    public static void main(String[] args)
    {

        System.out.print(fibonacci(10));
    }

    private static int fibonacci(int x)
    {

        if(x == 1 || x == 2)
        {
            if (x == 1 && max <= 1){
                max = x;
                System.out.println("1 \n1");
            }
            return 1;
        }

        // double recursive method call
        int i = fibonacci(x - 1) + fibonacci(x - 2);
        if (i >= max){
            max = i;
            System.out.println(i);
        }
        return i;
    }
}

