import java.util.*;

public class B_Square_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();
        int squareArea = side * side;

        System.out.println(squareArea);

        sc.close();
    }
;}
