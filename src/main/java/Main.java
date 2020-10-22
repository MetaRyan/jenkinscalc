import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Enter a command:");
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine();
        while (!input.equals("exit")) {
            String[] arguments = input.split(" ");
            int arg1 = Integer.parseInt(arguments[1]);
            int arg2 = 0;
            if (arguments.length >= 3)
                arg2 = Integer.parseInt(arguments[2]);
            if (arguments[0].equals("add")) {
                System.out.println(calc.add(arg1, arg2));
            } else if (arguments[0].equals("subtract")) {
                System.out.println(calc.subtract(arg1, arg2));
            } else if (arguments[0].equals("multiply")) {
                System.out.println(calc.multiply(arg1, arg2));
            } else if (arguments[0].equals("divide")) {
                System.out.println(calc.divide(arg1, arg2));
            } else if (arguments[0].equals("fibonacci")) {
                System.out.println(calc.fibonacciNumberFinder(arg1));
            } else if (arguments[0].equals("binary")) {
                System.out.println(calc.intToBinaryNumber(arg1));
            }
            input = sc.nextLine();
        }
    }
}