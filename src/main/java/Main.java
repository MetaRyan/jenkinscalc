import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Enter a command:");
        Scanner sc = new Scanner (System.in);
        String input = sc.next();
        String[] arguments = input.split(" ");
        int arg1 = Integer.parseInt(arguments[1]);
        int arg2 = Integer.parseInt(arguments[2]);
        if (arguments[0] == "add") {
            System.out.println(calc.add(arg1, arg2));
        } else if (arguments[0] == "subtract") {
            System.out.println(calc.subtract(arg1, arg2));
        } else if (arguments[0] == "multiply") {
            System.out.println(calc.multiply(arg1, arg2));
        } else if (arguments[0] == "divide") {
            System.out.println(calc.divide(arg1, arg2));
        } else if (arguments[0] == "fibonacci") {
            System.out.println(calc.fibonacciNumberFinder(arg1));
        } else if (arguments[0] == "binary") {
            System.out.println(calc.intToBinaryNumber(arg1));
        }
    }
}