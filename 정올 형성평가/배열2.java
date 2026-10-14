//형성평가1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[7]; // 인덱스 1~6 사용

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            count[num]++;
        }

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " : " + count[i]);
        }
    }
}
//형성평가2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[11]; // 인덱스 0~10 (0점대~100점)

        while (true) {
            int score = sc.nextInt();
            if (score == 0) {
                break;
            }
            count[score / 10]++;
        }

        for (int i = 10; i >= 0; i--) {
            if (count[i] > 0) {
                System.out.println((i * 10) + " : " + count[i] + " person");
            }
        }
    }
}
//형성평가3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        for (int i = 2; i < 10; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//형성평가4
public class Main {
    public static void main(String[] args) {
        int[][] arr = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }

        System.out.println(sum);
    }
}
//형성평가5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][3];

        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + "class? ");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
            System.out.println((i + 1) + "class : " + sum);
        }
    }
}
//형성평가6
public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[0][0] = 1;
        arr[0][2] = 1;
        arr[0][4] = 1;

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int left = (j - 1 >= 0) ? arr[i - 1][j - 1] : 0;
                int right = (j + 1 < 5) ? arr[i - 1][j + 1] : 0;
                arr[i][j] = left + right;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
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
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];
        int[][] result = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = arr1[i][j] * arr2[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
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
        int[][] arr = new int[4][2];
        int total = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
                total += arr[i][j];
            }
        }

        // 가로평균 (각 행의 평균)
        for (int i = 0; i < 4; i++) {
            int rowSum = arr[i][0] + arr[i][1];
            System.out.print((rowSum / 2) + " ");
        }
        System.out.println();

        // 세로평균 (각 열의 평균)
        for (int j = 0; j < 2; j++) {
            int colSum = 0;
            for (int i = 0; i < 4; i++) {
                colSum += arr[i][j];
            }
            System.out.print((colSum / 4) + " ");
        }
        System.out.println();

        // 전체평균
        System.out.println(total / 8);
    }
}
//형성평가9
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
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
        char[][] arr = new char[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Character.toLowerCase(arr[i][j]) + " ");
            }
            System.out.println();
        }
    }
}