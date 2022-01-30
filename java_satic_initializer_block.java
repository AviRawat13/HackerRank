import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_satic_initializer_block {
//    Code Written Here
    private static int B , H ;
    private static boolean flag = true;
//    this is called as Static initializer
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B<=0 || H<=0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
//            if you dont specify the flag to false then both the if() will excecute
            flag = false;
        }
    }
    public static void main(String[] args) {
//        This code is not to be Changed
        if (flag){
            int area = B*H;
            System.out.println(area);
        }

    }
}

