import java.util.*;

public class M_Continue_Practical_Use {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Enter number (0 for exit): ");
            int number = sc.nextInt();
            if(number == 0) {
                break;
            }
            if(number % 10 == 0) {
                continue;
            }
            System.out.println("You entered: " + number);
        }
        sc.close();
    }
}
