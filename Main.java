import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String expression = sca.nextLine();
        try {
            String result = calc(expression);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("throws Exception");
        }
    }
    public static String calc(String expression) throws Exception {
        String [] parts = expression.trim().split(" ");
        if (parts.length != 3) {
            throw new Exception();
        }
        int a;
        int b;

        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            throw new Exception();
        }
        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception();
        }
        String operation = parts[1];
        switch (operation) {
            case "+":
                return String.valueOf(a + b);
            case "-":
                return String.valueOf(a - b);
            case "*":
                return String.valueOf(a * b);
            case "/":
                if (b == 0) {
                    throw new Exception();
                }
                return String.valueOf(a / b);
            default:
                throw new Exception();
        }
    }
}
