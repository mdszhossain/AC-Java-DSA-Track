import java.util.*;

public class G_Print_Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        while(number>0) {
            int lastDigit = number % 10; // identifying last digit of number.
            System.out.print(lastDigit);
            number /= 10; // removing last digit from number.
        }
        System.out.println();

        sc.close();
    }
}
