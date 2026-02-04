public class G_Ternary_Operator {
    public static void main(String[] args) {
        int number = 5;

        // use of ternary operator
        String type = ((number % 2) == 0) ? "EVEN" : "ODD";
        System.out.println(type);
    }
}
