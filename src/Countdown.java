import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to start: ");
        int start = input.nextInt();
        System.out.println(countdown(start));
    }

    public static String countdown(int number)
    {
        // WRITE THIS RECURSIVE METHOD! note that it returns a string
        String str = "";
        if (number == 0){
            return str + "Blastoff!";
        } else {
            str += number;
            return str + " " + countdown(number - 1);
        }
    }
}

