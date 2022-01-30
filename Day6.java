import java.util.*;
public class Day6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String S;
        for (int i = 0;i < t; i++)
        {
            S = sc.nextLine();
            char[] charArray = S.toCharArray();
            for (int j = 0; j < charArray.length; j++ ) {
                if (j % 2 == 0) {
                    System.out.print(charArray[j]);
                }
            }
            System.out.print(" ");
            for (int j = 0; j < charArray.length; j++ )
            {
                if (j%2!=0)
                {
                    System.out.print(charArray[j]);
                }
            }
            System.out.println();
        }
    }
}
