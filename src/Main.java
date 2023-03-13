import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int sum = 0;
        int b = 1;
        while (number >= b) {
            sum += b;
            if (b<number) {
                System.out.print(b + " + ");
            } else if (b==number) {
                System.out.print(b + " = ");
            }
            b++;
        }
            System.out.println(sum);
    }
}

