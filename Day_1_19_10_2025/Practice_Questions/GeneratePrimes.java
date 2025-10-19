import java.util.Scanner;

public class GeneratePrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number upto which you want to print prime numbers :");
        int num = sc.nextInt();

        printPrime(num);

        sc.close();

    }

    private static void printPrime(int num) {
        boolean flag = true;

        System.out.println("Prime numbers upto " + num + " are.");
        for (int i = 2; i <= num; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }

    }
}
