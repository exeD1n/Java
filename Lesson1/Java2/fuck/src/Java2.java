// Вывести все простые числа от 1 до 1000

public class Java2 {
    public static void main(String[] args) throws Exception {
        for (int j = 1; j <= 1000; j++) {
            boolean simple = false;

            for (int i = 2; i * i <= j; i++) {
                simple = (j % i == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.print(j + " ");
            }
        }
    }
}
