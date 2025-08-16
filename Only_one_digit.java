import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            int minDigit = 9;
            int temp = x;
            
            while (temp > 0) {
                int digit = temp % 10;
                if (digit < minDigit) minDigit = digit;
                temp /= 10;
            }
            
            System.out.println(minDigit);
        }
    }
}
