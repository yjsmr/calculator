import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = calculator.createScanner();
        Integer a;
        Integer b;
        Character o;
        try {
            System.out.println("Enter first number:");
            a = sc.nextInt();
            System.out.println("Enter second number:");
            b = sc.nextInt();
            System.out.println("Enter operation:");
            o = sc.next().charAt(0);
            System.out.println(o);

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public Integer performOperation(Character operand, int a, int b) {
        switch (operand) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                System.out.println("incorrect operand");
                return null;
        }
    }

    public Scanner createScanner() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }
}
