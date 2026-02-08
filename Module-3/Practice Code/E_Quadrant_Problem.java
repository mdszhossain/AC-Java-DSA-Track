import java.util.*;

public class E_Quadrant_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // (0,0), (0,y), (x,0) will not provide as input
        System.out.print("Enter value of x & y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // if else-if ladder
        if(x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        } else if(x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        } else if(x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        } else {
            System.out.println("Quadrant 4");
        }


        sc.close();
    }
}
