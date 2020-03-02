import java.util.InputMismatchException;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        fib();
    }

    public static void fib (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number to count");
        int a = 0;
        try {
            a = scan.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Wrong Input!");
            System.exit(0);
        }
        if (a < 0){
            System.out.println("Wrong Input!");
            System.exit(0);
        }

        count(a);

    }
    public static void count(int number){
        int i=1;
        int num1 = 0, num2 = 1;
        while(i<=number)
        {
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
        System.out.println(num2);
    }
}
