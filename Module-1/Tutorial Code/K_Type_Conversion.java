import java.util.*;

public class K_Type_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // automatically converted to float during assign
        float number = sc.nextInt();
        System.out.println(number);

        // integer is converted to long during assigning to longNumber variable
        int integer = 25;
        int longNumber = integer;
        System.out.println(longNumber);

        sc.close();
    }
}