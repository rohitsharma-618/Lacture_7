import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();
        int sum =0;

        int num = 1;

        while(num <= n) {
           System.out.println(num);
            sum = sum + num;
            num++;
        }
        System.out.println("Total of above numbers:- " +sum);


    }
}
