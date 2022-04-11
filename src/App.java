import java.util.*;

// import java.io.*;
public class App {
    // methods
    public int summation(int x, int y) {
        return x + y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public int division(int x, int y) {
        return x / y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public int modulus(int x, int y) {
        return x % y;
    }

    public int exponent(int x, int y) {
        return (int) Math.pow(x, y);
    }

    public int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public int fibonacci(int x) {
        int num = 0;
        int fib1 = 0;
        int fib2 = 1;
        for (int i = 0; i < x; i++) {
            num = fib1 + fib2;
            fib2 = fib1;
            fib1 = num;
        }
        return num;
    }

    // public int fibonacciList(int x) {
    //     int num = 0;
    //     int fib1 = 0;
    //     int fib2 = 1;
    //     int fibList[] = new int[x];
    //     for (int i = 0; i < x; i++) {
    //         num = fib1 + fib2;
    //         fib2 = fib1;
    //         fib1 = num;
    //         fibList[i] = num;
    //     }
    //     return num;
    // }

    // main method
    public static void main(String[] args) throws Exception {
        App app = new App();
        Scanner input = new Scanner(System.in);
        int x = 0, y = 0, i;
        String[] operation = { "+", "-", "*", "/", "%", "^", "!","fib" };
        System.out.println("Enter the operation you want to perform:[+,-,*,/,%,^,!,fib]");
        String oper = input.nextLine();
        if (oper.equals(operation[6])) {
            System.out.println("\nEnter the number");
            x = input.nextInt();
        }else if(oper.equals(operation[7])){
            // System.out.println("list of fibonacci numbers(Y) or number of fibonacci series(N)");
            System.out.println("\nEnter the number");
            x = input.nextInt();

        } else {
            System.out.println("\nEnter the first number");
            x = input.nextInt();
            System.out.println("\nEnter the second number");
            y = input.nextInt();
        }
        int result = 0;
        for (i = 0; i < operation.length; i++) {
            if (oper.equals(operation[i])) {
                switch (oper) {
                    case "+":
                        result = app.summation(x, y);
                        break;
                    case "-":
                        result = app.subtraction(x, y);
                        break;
                    case "*":
                        result = app.multiplication(x, y);
                        break;
                    case "/":
                        result = app.division(x, y);
                        break;
                    case "%":
                        result = app.modulus(x, y);
                        break;
                    case "^":
                        result = app.exponent(x, y);
                        break;
                    case "!":
                        result = app.factorial(x);
                        break;
                    case "fib":
                        result = app.fibonacci(x);
                        // result = app.fibonacciList(z);
                        break;
                    default:
                        System.out.println("Invalid operation choosen");
                        break;
                }
            }
            input.close();
        }
        if (oper.equals(operation[6])) {
            System.out.println("Factorial of " + x + " is " + result);
        }else if(oper.equals(operation[7])){
            System.out.println("The "+ x +" Fibonacci number is " + result);
        } else {
            System.out.format("\n %x %s %d = %d", x, oper, y, result);
        }
    }
}
