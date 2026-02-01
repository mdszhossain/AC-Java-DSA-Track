import java.util.*;

public class A_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        float average = sum / 3.0f;

        System.out.println(average);

        sc.close();
    }
}
