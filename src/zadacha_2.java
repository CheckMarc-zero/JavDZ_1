import java.util.Scanner;
public class zadacha_2 {
    public static void main(String[] args){
        System.out.print("Введите N: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean b = true;
        for ( int p=2; p<=n; p++){
            for(int i=2; i<p; i++){
                if(p%i==0){
                    b=false;
                    break;
                }
            }
            if(b) System.out.println(p);
            else b=true;
        }
    }
}
