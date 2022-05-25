import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maior = 0;
        int posMaior = 1;
        int x;
        for (int i = 1; i <= 100; i++) {
            x = leitor.nextInt();
            if (i == 1) {
                maior = x;
            } else if (x > maior) {
                maior = x;
                posMaior = i;
            }
        }
        System.out.println(maior);
        System.out.println(posMaior);
    }

}