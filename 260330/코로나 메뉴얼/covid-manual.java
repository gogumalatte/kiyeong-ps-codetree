import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] isCold = new char[3];
        int[] temp = new int[3];
        int res = 0;
        
        for(int i = 0; i < 3; ++i) {
            isCold[i] = sc.next().charAt(0);
            temp[i] = sc.nextInt();

            if(isCold[i] == 'Y' && temp[i] >= 37) {
                res++;
            }
        }

        if(res >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
        
    }
}