import java.util.*;

public class D_Print_Character_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range: ");
        char ch = 'A';
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}
