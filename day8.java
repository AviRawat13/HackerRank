import java.util.*;
public class day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String ,Integer> phoneBook = new HashMap<String,Integer>();

//                Loop
        for(int i = 1;i<=n; i++)
        {
            String name = sc.next();
            int phone = sc.nextInt();
            phoneBook.put(name,phone);
        }

        while(sc.hasNext()) {
            String s = sc.next();
            if (phoneBook.containsKey(s))
            {
                System.out.println(s+"="+phoneBook.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
    }
}