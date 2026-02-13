import java.util.*;

public class A_Even_Odd_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        // input 5 integers
        int num;
        for(int i=1; i<=5; i++) {
            num = sc.nextInt();
            if(num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);

        sc.close();
    }
}
