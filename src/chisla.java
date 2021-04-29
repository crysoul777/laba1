import java.util.Scanner;
public class chisla {

    public static void main(String[] args) {

        int n = 100;
        boolean bl = true;

        System.out.println("Простые числа: ");

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    bl = false;
                    break;
                }
            }
            if (bl) System.out.print(i + " ");
            else bl = true;
        }
    }
}