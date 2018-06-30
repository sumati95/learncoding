import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = sc.nextLine();
        for (int i = 0; i < t; i++) {
            String first = "" ;
            String second = "";
            str = sc.nextLine();
            for (int c = 0; c < str.length(); c++) {
                char ch = str.charAt(c);
                if (c % 2 == 0) {
                    first += ch;
                }
                else {
                    second += ch;
                }
            }
            System.out.println(first +" " +second);
        }
        sc.close();
    }
}