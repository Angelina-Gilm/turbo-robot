import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int operand1 = scanner.nextInt();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        int operand2 = scanner.nextInt();

        int result = 0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Ошибка: деление на ноль запрещено!");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: неверный оператор!");
                return;
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}
