import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = calculator.createScanner();
        int a = sc.nextInt();
        System.out.println(a);
    }

    public Scanner createScanner() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }
}
