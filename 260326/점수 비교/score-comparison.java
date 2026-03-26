import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a_math = sc.nextInt();
        int a_en = sc.nextInt();

        int b_math = sc.nextInt();
        int b_en = sc.nextInt();

        if(a_math > b_math && a_en > b_en) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}