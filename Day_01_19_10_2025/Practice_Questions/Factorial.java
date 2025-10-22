import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number whose factorial you want to calculate :");
        int num = sc.nextInt();

        int result = factorial(num);

        System.out.println("Factorial of "+num+ " is : "+result);
        sc.close();
    }

    private static int factorial(int num) {
        int fact=1;

        if(num == 0 || num == 1){
            return fact;
        }
        for(int i = 1; i <= num; i++){
            fact*=i;
        }
        return fact;
    }
}
