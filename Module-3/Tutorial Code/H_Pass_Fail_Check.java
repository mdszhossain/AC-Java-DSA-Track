import java.util.*;

public class H_Pass_Fail_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
        String reportCard = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(reportCard);

        sc.close();
    }
}
