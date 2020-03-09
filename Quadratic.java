import java.util.InputMismatchException;
import java.util.Scanner;



public class Quadratic {
    static double a =0, b= 0, c =0;

    public static void main(String[] args) {

        boolean again = true;
        while (again) {
            square();
            System.out.println("Exit the program? 1 - yes, 0 - no");
            Scanner scan = new Scanner(System.in);
            int ask;
            ask = scan.nextInt();
            if (ask == 1) {
                again = false;
            } else {
                again = true;
            }
        }
    }

    public static void inputA(){
  //      double a = 0;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Input first a");
            a=scan.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("Wrong input!");
            inputA();
        }
    }

    public static void inputB(){
//        double b = 0;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Input first b");
            b=scan.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("Wrong input!");
            inputB();
        }
    }

    public static void inputC(){

        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Input first c");
            c=scan.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("Wrong input!");
            inputC();
        }
    }



    public static void square (){

        boolean repet = true;
        int check = 0;
        Scanner scan = new Scanner(System.in);


        inputA();
        inputB();
        inputC();



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








