// 함수3 - 형성평가1
import java.util.Scanner;

public class Main {
    public static void printSequence(int n) {
        if (n == 0) {
            return;
        }
        printSequence(n / 2);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        printSequence(n);
    }
}
// 함수3 - 형성평가2
import java.util.Scanner;

public class Main {
    public static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        printNumbers(n - 2);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        printNumbers(n);
    }
}
// 함수3 - 형성평가3
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] dice;

    public static void roll(int depth, int sum) {
        if (depth == n) {
            if (sum == m) {
                for (int i = 0; i < n; i++) {
                    System.out.print(dice[i] + " ");
                }
                System.out.println();
            }
            return;
        }

        for (int i = 1; i <= 6; i++) {
            if (sum + i <= m) {
                dice[depth] = i;
                roll(depth + 1, sum + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();
        
        dice = new int[n];
        roll(0, 0);
    }
}
// 함수3 - 형성평가4
import java.util.Scanner;

public class Main {
    static int[] memo = new int[101];

    public static int getSequence(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (memo[n] != 0) return memo[n];
        
        memo[n] = (getSequence(n - 1) * getSequence(n - 2)) % 100;
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        System.out.println(getSequence(n));
    }
}
// 함수3 - 형성평가5
import java.util.Scanner;

public class Main {
    public static int getCount(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return getCount(n / 2) + 1;
        } else {
            return getCount(n / 3) + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        System.out.println(getCount(n));
    }
}
// 함수3 - 형성평가6
import java.util.Scanner;

public class Main {
    public static int getDigitProduct(long n) {
        if (n == 0) return 1;
        
        int digit = (int) (n % 10);
        if (digit == 0) {
            return getDigitProduct(n / 10);
        } else {
            return digit * getDigitProduct(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        sc.close();
        
        System.out.println(getDigitProduct(a * b * c));
    }
}
