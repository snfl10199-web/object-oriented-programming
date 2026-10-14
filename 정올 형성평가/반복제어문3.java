//형성평가1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        for (int i = 0; i < 20; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }

        int avg = sum / count;

        System.out.println(sum + " " + avg);
    }
}
//형성평가2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; n * i < 100; i++) {
            int multiple = n * i;
            System.out.print(multiple + " ");
            if (multiple % 10 == 0) {
                break;
            }
        }
    }
}
//형성평가3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//형성평가4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            printLine(n, i);
        }
        for (int i = 2; i <= n; i++) {
            printLine(n, i);
        }
    }

    public static void printLine(int n, int i) {
        for (int s = 0; s < n - i; s++) {
            System.out.print(" ");
        }
        for (int k = 0; k < 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
//형성평가5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < (n - i) * 2; s++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//형성평가6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < (n - i) * 2; s++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (k > 1) {
                    System.out.print(" ");
                }
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
//형성평가7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char letter = 'A';
        int number = 0;

        for (int i = 1; i <= n; i++) {
            int letterCount = n - i + 1;
            int numberCount = i - 1;

            for (int j = 0; j < letterCount; j++) {
                System.out.print(letter + " ");
                letter++;
            }
            for (int j = 0; j < numberCount; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
//형성평가8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < (i - 1) * 2; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(num + " ");
                num++;
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
            for (int j = 0; j < i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int s = 0; s < (n - i) * 2; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("# ");
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
        int n = sc.nextInt();

        int[] odds = {1, 3, 5, 7, 9};
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(odds[index % 5] + " ");
                index++;
            }
            System.out.println();
        }
    }
}