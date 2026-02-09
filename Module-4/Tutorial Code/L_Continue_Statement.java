public class L_Continue_Statement {
    public static void main(String[] args) {
        int counter = 1;

        while(counter <= 10) {
            if(counter == 6) {
                counter++;
                continue;
            }
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
