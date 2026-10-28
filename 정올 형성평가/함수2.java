// 함수2 - 형성평가1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        int closestScore = -1;
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int diff = Math.abs(a - x);
            
            if (diff < minDiff) {
                minDiff = diff;
                closestScore = a;
            }
        }
        sc.close();
        
        System.out.println(closestScore);
    }
}
// 함수2 - 형성평가2
import java.util.Scanner;

public class Main {
    public static int getBacteria(int t) {
        int result = 1;
        for (int i = 0; i < t; i++) {
            result *= 3;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.close();
        
        System.out.println(getBacteria(t));
    }
}
// 함수2 - 형성평가3
import java.util.Scanner;

public class Main {
    public static void printDivisors(int n) {
        int limit = (int) Math.sqrt(n);
        for (int i = 1; i <= limit; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        printDivisors(n);
    }
}
// 함수2 - 형성평가4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }
        
        System.out.println((maxX - minX) * (maxY - minY));
        sc.close();
    }
}