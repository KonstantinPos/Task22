import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое вещественное число");
        double a = scanner.nextDouble();
        System.out.println("Введите  второе вещественное число");
        double b = scanner.nextDouble();
        System.out.println("Введите третье вещественное число");
        double c = scanner.nextDouble();
        if ((Math.abs(a) < Math.abs(b))&&(Math.abs(a) < Math.abs(c))) {
            System.out.println("Меньшее по модулю из трёх введённых чисел "+a);
        } else if ((Math.abs(b) < Math.abs(a)) && (Math.abs(b) < Math.abs(c))) {
            System.out.println("Меньшее по модулю из трёх введённых чисел "+b);
        } else if ((Math.abs(c) < Math.abs(a)) && (Math.abs(c) < Math.abs(b))) {
            System.out.println("Меньшее по модулю из трёх введённых чисел "+c);
        }
    }
}
