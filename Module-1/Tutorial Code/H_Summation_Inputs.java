import java.util.*;

public class H_Summation_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input 2 numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // calculate sum
        int sum = a + b;
        System.out.println(sum);

        sc.close();
    }
}