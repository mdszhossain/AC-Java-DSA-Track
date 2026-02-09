import java.util.*;
// Keep entering numbers till user enters a multiple of 10
public class K_Break_Practical_Use {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Enter number: ");
            int number = sc.nextInt();
            if(number % 10 == 0) {
                System.out.println("Wrong Input :(");
                break;
            }
            System.out.println("You entered: " + number);
        }

        sc.close();
    }
}
