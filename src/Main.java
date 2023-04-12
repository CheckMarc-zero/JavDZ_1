import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Введите N: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i<=n; i++){
            sum = sum + i;
            factorial = factorial*i;
        }
        System.out.print("Треугольное число: ");
        System.out.println(sum);
        System.out.print("Факториал: ");
        System.out.println(factorial);
    }
}
