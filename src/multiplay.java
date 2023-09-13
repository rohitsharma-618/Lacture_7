import java.util.Scanner;

public class multiplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:- ");
        int n = sc.nextInt();

        int num = 1;
        int multiply = num;

        while (num <= n){
            System.out.println(num);
            multiply = multiply * num;

            num++;
        }
        System.out.println("Multiplication of above numbers :- " + multiply);

    }
}
