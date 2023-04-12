import java.util.Scanner;
public class zadacha_3 {
    public static void main(String[] args) {
        double ans;
        System.out.println("Введите два числа : ");
        Scanner in = new Scanner(System.in);
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        System.out.print("\nВведите действие (+, - , *, /) : ");
        char op = in.next().charAt(0);
        switch (op){
            case '+' : ans=num1+num2;
            break;
            case '-' : ans = num1-num2;
            break;
            case '*' : ans = num1*num2;
            break;
            case '/' : ans = num1/num2;
            break;
            default: System.out.printf("Ошибка! Неправильно введён оператор!");
            return;
        }
        System.out.println("Результат: ");
        System.out.println(num1+ " "+op+" "+num2+" = "+ans);
    }
}
