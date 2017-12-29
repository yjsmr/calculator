import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = calculator.createScanner();
        Integer a;
        try {
            a = sc.nextInt();
            System.out.println(a);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public Scanner createScanner() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }
}
