import java.util.*;

public class C_Item_Cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pencilPrice = sc.nextFloat();
        float penPrice = sc.nextFloat();
        float eraserPrice = sc.nextFloat();

        float totalCost = pencilPrice + penPrice + eraserPrice;
        System.out.println(totalCost);

        float totalCostWithGST = totalCost + (totalCost * 0.18f);
        System.out.println(totalCostWithGST);

        sc.close();
    }
}
