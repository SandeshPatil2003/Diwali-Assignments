import java.util.Scanner;

public class FindLongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings : ");
        int size = sc.nextInt();

        String str[] = new String[size];

        sc.nextLine();

        for(int i=0;i<size;i++){
            System.out.print("Enter String "+(i+1)+" : ");
            str[i]=sc.nextLine();
        }

        int maxlength = findMaxStingLength(str);

        System.out.println("Max Length from String array is : "+maxlength);
        sc.close();
    }

    private static int findMaxStingLength(String[] str) {
        int maxlength = 0;

        for(String s:str){
            if (s.length()>maxlength) {
                maxlength=s.length();
            }
        }
        return maxlength;
    }
}
