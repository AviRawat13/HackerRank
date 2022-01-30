import java.util.*;
public class basic_string_basic_IMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
//        use sc.nextLine() - beacuse if i dont use it this code will show error because when we execute the nextInt after that nextLine() one will be skippped beacuse it take the enter as it value that we have pressed to enter the value in the double one above the nextLine one
        sc.nextLine();
        String s = sc.nextLine();

//        printing
        System.out.println("String:" + s);
        System.out.println("Double:" + d);
        System.out.println("Integer" + i);
    }
}
