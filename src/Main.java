import java.util.Scanner;

public class Main {
    public static double result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double first = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double second = scanner.nextDouble();
        System.out.println("Введите операцию, проводимую над числами: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
        int i = scanner.nextInt();
        if ((i < 1) || (i > 4 )) {
            do {
                System.out.println("Ошибка. Введённой опреации не существует. Введите повторно:");
                i = scanner.nextInt();
            } while ((i < 1) || (i > 4));
        }
        operation(i, first, second);
        System.out.print("Операция выполнена. Результат: ");
        System.out.println(result);

    }
    public static double operation (int i, double first, double second)
    {
        if (i == 1) {
            result = first + second;
        }
        if (i == 2) {
            result = first - second;
        }
        if (i == 3) {
            result = first * second;
        }
        if (i == 4) {
            result = first / second;
        }
        return result;
    }
}