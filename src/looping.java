import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 3;
        while(num <= n){
        System.out.println(num);
        num++;
        }
    }
}
