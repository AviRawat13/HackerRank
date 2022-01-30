// DAY 2 PROJECT
import java.util.*;
import java.lang.Math;
public class Operator {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    new ope
    double meal_cost = sc.nextDouble();
    int tip_percent = sc.nextInt();
    int tax_percent = sc.nextInt();
    double tip = tip_percent*meal_cost/100;
    double tax = tax_percent*meal_cost/100;
    double total_cost =meal_cost + tip + tax;
        System.out.println(Math.round(total_cost));
    }


}
