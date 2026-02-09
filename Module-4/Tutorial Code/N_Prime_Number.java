import java.util.*;

public class N_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isPrime = true;
        int number = sc.nextInt();

        if(number == 2) {
            isPrime = true;
        }
        for(int i=3; i*i<=number; i++) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Composite Number");
        }

        sc.close();
    }
}
