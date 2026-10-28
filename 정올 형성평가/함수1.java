// 함수1 - 형성평가1
public class Main {
    public static void printAt() {
        System.out.println("@@@@@@@@@@");
    }

    public static void main(String[] args) {
        System.out.println("first");
        printAt();
        System.out.println("second");
        printAt();
        System.out.println("third");
        printAt();
    }
}
// 함수1 - 형성평가2
import java.util.Scanner;

public class Main {
    public static void printSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        printSum(num);
    }
}
// 함수1 - 형성평가3
import java.util.Scanner;

public class Main {
    public static void printSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        printSquare(n);
    }
}
// 함수1 - 형성평가4
import java.util.Scanner;

public class Main {
    public static int getSquareDifference(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        return (max * max) - (min * min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        System.out.println(getSquareDifference(a, b));
    }
}
// 함수1 - 형성평가5
import java.util.Scanner;

public class Main {
    public static void printResult(int[][] scores) {
        int[] colSum = new int[3];
        int totalSum = 0;

        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + " ");
                rowSum += scores[i][j];
                colSum[j] += scores[i][j];
            }
            System.out.println(rowSum);
            totalSum += rowSum;
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(colSum[i] + " ");
        }
        System.out.println(totalSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        printResult(scores);
    }
}