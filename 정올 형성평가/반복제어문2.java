//형성평가1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("JUNGOL");
        }
    }
}
//형성평가2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int small = Math.min(a, b);
        int large = Math.max(a, b);

        for (int i = small; i <= large; i++) {
            System.out.print(i + " ");
        }
    }
}
//형성평가3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
//형성평가4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        double avg = (double) sum / n;

        System.out.printf("%.2f%n", avg);
    }
}
//형성평가5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("even : " + even);
        System.out.println("odd : " + odd);
    }
}
//형성평가6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int small = Math.min(a, b);
        int large = Math.max(a, b);

        int sum = 0;
        int count = 0;

        for (int i = small; i <= large; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                count++;
            }
        }

        double avg = (double) sum / count;

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f%n", avg);
    }
}
//형성평가7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i + " ");
        }
    }
}
//형성평가8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}
//형성평가9
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("(" + i + ", " + j + ") ");
            }
            System.out.println();
        }
    }
}
//형성평가10
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int step = (a <= b) ? 1 : -1;
        int count = Math.abs(b - a) + 1;

        for (int i = 1; i <= 9; i++) {
            int dan = a;
            for (int k = 0; k < count; k++) {
                System.out.printf("%d * %d = %2d   ", dan, i, dan * i);
                dan += step;
            }
            System.out.println();
        }
    }
}