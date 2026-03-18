import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        a += b;
        b += a;

        System.out.printf("%d %d\n", a, b);
    }
}