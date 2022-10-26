import java.util.Scanner;

// Реализовать простой калькулятор

public class Java3 {
    public static void main(String[] args) throws Exception {

        while(true){
            System.out.println("Выберете действие\n1-сложение\n2-вычитание");
            Scanner in = new Scanner(System.in);
            System.out.print("Input number: ");
            int number_user = in.nextInt();
            
            if(number_user == 1){
                System.out.print("1 число для сложения: ");
                Double summ_one = in.nextDouble();
                System.out.print("2 число для сложения: ");
                Double summ_two = in.nextDouble();
                Double summ = summ_one + summ_two;
                System.out.println(summ);
            }
            if(number_user == 2){
                System.out.print("1 число от которого вычитать: ");
                Double summ_one = in.nextDouble();
                System.out.print("2 число которое отнимается: ");
                Double summ_two = in.nextDouble();
                Double summ = summ_one - summ_two;
                System.out.println(summ);
            }
        }
    }
}
