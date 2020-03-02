import java.util.InputMismatchException;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args){
       square();
    }

    public static void square (){
        double a = 0, b = 0, c = 0;
        boolean repet = true;
        int check = 0;
        Scanner scan = new Scanner(System.in);
        while(repet) {
            try {
                System.out.println("Input first a");
                a = scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!");
                check = 1;
            }
            if (check == 1) {
                repet = true;
            } else {
                repet = false;
            }
        }
        System.out.println("Input b");
        b = scan.nextDouble();
        System.out.println("Input c");
            c = scan.nextDouble();
        /*
        catch(InputMismatchException e){
            System.out.println("Wrong input!");
            System.exit(0);
        }*/
        if (a == 0) {
            System.out.println("ERROR: not a quadratic function");
        } else {
            calculate(a, b, c);
        }
    }

    public static void calculate(double a, double b, double c){
        double delta = 0;
        boolean imag = false;
        if (Math.pow(b,2) >= 4*a*c) {
            delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        } else {
           imag = true;
        }
        double x1 = (-b - delta) / (2*a);
        double x2 = (-b + delta) / (2*a);
        if (imag) {
            System.out.println("the results are Imaginary");
        }else {
            System.out.println("the results are: " + x1 + " " + x2);
        }
    }
}








