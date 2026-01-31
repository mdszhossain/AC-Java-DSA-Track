public class M_Type_Promotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)b);
        System.out.println((int)a);

        // Type promotions will happen only with expressions
        System.out.println(b-a);

        short num1 = 5;
        byte num2 = 25;
        char ch = 'c';
        byte bt = (byte)(num1 + num2 + ch);
        System.out.println(bt);

        int fNum1 = 10;
        float fNum2 = 20.225f;
        long fNum3 = 25;
        double fNum4 = 30;
        double ans = fNum1 + fNum2 + fNum3 + fNum4;
        System.out.println(ans);
    }
}
