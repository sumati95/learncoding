import java.util.Scanner;

public class Solution4 {
    static  void solution (int N) {
        if (N % 2 == 1) {
            System.out.println("Weird");
        }
        else {
            if ( N > 2 && N < 5) {
                System.out.println("Not Weird");
            }
            if (N > 6 && N < 20) {
                System.out.println("Weird");
            }
            if (N > 20) {
                System.out.println("Not Weird");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}
