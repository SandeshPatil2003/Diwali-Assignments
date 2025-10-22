import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check even or odd :");
        int num = sc.nextInt();

        isEvenOrOdd(num);

        sc.close();
    }

    private static void isEvenOrOdd(int num) {
       
        if (num% 2 == 0) {
           System.out.println(+num+" is even."); 
        }
        else{
            System.out.println(+num+" is odd."); 
        }
    }
}
