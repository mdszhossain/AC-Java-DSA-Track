public class C_Relational_Operator {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;
        // equal to
        System.out.println((A == B)); // output: false

        B = 10;
        System.out.println((A == B)); // output: true

        // not equal to
        A = 5;
        System.out.println((A != B)); // output: true

        A = 10;
        System.out.println((A != B)); // output: false

        B = 5;
        // greater then
        System.out.println((A > B)); // output: true
        System.out.println((B > A)); // output: false

        // less then
        System.out.println((B < A)); // output: true
        System.out.println((A < B)); // output: false;

        // greater equal to
        System.out.println((A >= B)); // output: true

        // less equal to
        System.out.println((B <= A)); // output: true
    }
}
