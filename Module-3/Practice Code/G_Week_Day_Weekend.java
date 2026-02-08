import java.util.*;

public class G_Week_Day_Weekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Day Name: ");
        String dayName = sc.next();

        switch(dayName) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday": System.out.println("Week Day");
                            break;
            case "Saturday":
            case "Sunday": System.out.println("Weekend");
                            break;
            default: System.out.println("Invalid Input");
        }

        sc.close();
    }
}
