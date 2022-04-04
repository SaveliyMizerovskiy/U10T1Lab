public class main {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }

    public static int factorial(int num){
        int x = 1;
        for (int i = 1; i <= num; i++) {
            x *= i;
        }
        return x;
    }


}
