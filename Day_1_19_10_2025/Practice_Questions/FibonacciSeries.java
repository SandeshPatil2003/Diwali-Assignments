import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number upto which you want to print Fibonacci Series:");
        int num = sc.nextInt();

        printFibonacciSeries(num);
        sc.close();
    }

    private static void printFibonacciSeries(int num) {
        
        int fst=0,snd=1,trd=0;
        System.out.println("Fibonacci Series upto "+num+" is.");

       System.out.print(+fst+" "+snd+" ");
        for(int i=3;i<=num;i++){
            trd=fst+snd;
            fst=snd;
            snd=trd;
            System.out.print(+trd+" ");
        }
    }
    
}
