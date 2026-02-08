import java.util.*;

public class F_Quadrant_Elimination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // (0,0), (0,y), (x,0) will not provide as input
        System.out.print("Enter value of x & y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Quadrant elimination process
        if(x > 0) { // eliminated Q2, Q3
            if(y > 0) {
                System.out.println("Quadrant 1");
            } else {
                System.out.println("Quadrant 4");
            }
        } else { // eliminated Q1, Q4
            if(y > 0) {
                System.out.println("Quadrand 2");
            } else {
                System.out.println("Quadrant 3");
            }
        }

        sc.close();
    }
}
