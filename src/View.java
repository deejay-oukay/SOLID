import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public double getReal(Integer number) {
        System.out.print("Укажите действительную часть "+number+"-го комплексного числа: ");
        return scanner.nextDouble();
    }

    public double getImaginary(Integer number) {
        System.out.print("Укажите мнимую часть "+number+"-го комплексного числа: ");
        return scanner.nextDouble();
    }

    public void showResult(String result) {
        System.out.println("Результат: " + result);
    }

    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }

    public int selectAction() {
        System.out.println("Какое действие необходимо выполнить?");
        System.out.println("1 - Сложение");
        System.out.println("2 - Умножение");
        System.out.println("3 - Деление");
        return scanner.nextInt();
    }
}
