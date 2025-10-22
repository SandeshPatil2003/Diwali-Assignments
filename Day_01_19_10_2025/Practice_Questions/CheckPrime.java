import java.util.Scanner;
public class CheckPrime{
    public static void main(String args[]){{

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter an positive number to sheck if its prime or not : ");
        int num = sc.nextInt();

        boolean result = isPrime(num);

        System.out.println(result);

         sc.close();

    }}

    public static boolean isPrime(int num){

        if(num <= 1)
        return false;

        for(int i = 2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

} 