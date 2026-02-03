public class D_Logical_Operator {
    public static void main(String[] args) {
        // Logical AND (&&) -> If both statement true then final answer true. otherwise false
        System.out.println("Logical AND");
        System.out.println((3>2) && (5>0)); // output: true
        System.out.println((3<2) && (5>0)); // output: false
        System.out.println((3>2) && (5<0)); // output: false
        System.out.println((3<2) && (5<0)); // output: false
        System.out.println();

        // Logical OR (||) -> If a single statement becomes true then final answer will be true. otherwise false
        System.out.println("Logical OR");
        System.out.println((3>2) || (5>0)); // output: true
        System.out.println((3>2) || (5<0)); // output: true
        System.out.println((3<2) || (5>0)); // output: true
        System.out.println((3<2) || (5<0)); // output: false
        System.out.println();

        // Logical NOT (!)
        System.out.println("Logical NOT");
        System.out.println(!(3>5)); // output: true
        System.out.println(!(3>2)); // output: false
    }
}
