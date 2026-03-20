import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = 0;

        if(a > b) {
            res = a - b;
        } else {
            res = b - a;
        }

        System.out.println(res);
    }
}