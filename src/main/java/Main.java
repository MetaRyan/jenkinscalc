public class Main {
    public static void main (String[] args) {
        Calculator calc = new Calculator();
        int arg1 = Integer.parseInt(args[1]);
        int arg2 = Integer.parseInt(args[2]);
        if (args[0] == "add") {
            System.out.println(calc.add(arg1, arg2));
        } else if (args[0] == "subtract") {
            System.out.println(calc.subtract(arg1, arg2));
        } else if (args[0] == "multiply") {
            System.out.println(calc.multiply(arg1, arg2));
        } else if (args[0] == "divide") {
            System.out.println(calc.divide(arg1, arg2));
        } else if (args[0] == "fibonacci") {
            System.out.println(calc.fibonacciNumberFinder(arg1));
        } else if (args[0] == "binary") {
            System.out.println(calc.intToBinaryNumber(arg1));
        }
    }
}