import java.util.Scanner;

public class PrintAllDivisors {
    public void Div(int x) {
        for (int i = 1; i * i <= x; i++) {     /*so that the code will run upto root x and will not print duplicates */
            if (x % i == 0) {
                System.out.print(i + ",");

                if (i != x / i) {
                    System.out.print(x / i + ",");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        PrintAllDivisors pad = new PrintAllDivisors();
        pad.Div(x);
    }
}