import java.util.Scanner;
import java.text.DecimalFormat;


public class App
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        int R;
        double pi, VOLUME;

        pi = 3.14159;
        R = input.nextInt();

        VOLUME = (4/3.0) * pi * Math.pow(R,3);
        System.out.println("VOLUME = " + df.format(VOLUME));

    }
}