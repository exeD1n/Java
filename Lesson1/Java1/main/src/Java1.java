import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Java1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number_user = in.nextInt();
        
        int summ = 0;
        for (int i = 1; i < number_user+1; i++){
            summ+=i;
        }
        System.out.println("Сумма чисел"+summ);


        int doble = 1;
        for (int i = 1; i < number_user+1; i++){
            doble*=i;
        }
        System.out.println("Сумма чисел"+doble);
    }
}
