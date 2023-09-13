import java.util.Scanner;

public class forLoopAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int add = 0;

        for (int num = 10; num <= n; num+=5) {
            System.out.println(num);
            add = add + num;
        }
        System.out.println("HEAR IS YOUR RESULT :- " +add);
    }
}
 