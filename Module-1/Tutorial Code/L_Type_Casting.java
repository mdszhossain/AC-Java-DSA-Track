public class L_Type_Casting {
    public static void main(String[] args) {
        float a = 25.12f;

        // explicitly converted float to int
        int b = (int)a;
        System.out.println(b);

        float marks = 99.999f;
        int marks2 = (int)marks;
        System.out.println(marks2);

        char ch = 'a';
        char ch2 = 'b';
        // assigning the ANSII value to number variables. Automatically converting from character to integer
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
    }
}
