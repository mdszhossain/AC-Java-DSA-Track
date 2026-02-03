public class B_Unary_Operator {
    public static void main(String[] args) {
        // pre increment operator
        int a = 10;
        int b = ++a;
        System.out.println("Using Pre Increment");
        System.out.println(a);
        System.out.println(b);


        // post increment operator
        int c = 10;
        int d = c++;
        System.out.println("Using Post Increment");
        System.out.println(c);
        System.out.println(d);


        // pre decrement operator
        int e = 10;
        int f = --e;
        System.out.println("Using Pre Decrement");
        System.out.println(e);
        System.out.println(f);

        // post decrement operator
        int g = 10;
        int h = g--;
        System.out.println("Using Post Decrement");
        System.out.println(g);
        System.out.println(h);


    }
}