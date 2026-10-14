//형성평가1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next().charAt(0);
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
//형성평가2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = arr[0] + arr[2] + arr[4];

        System.out.println(sum);
    }
}
//형성평가3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int odd = 0;
        int even = 0;

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                odd += arr[i];
            } else {
                even += arr[i];
            }
        }

        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }
}
//형성평가4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            arr[count] = num;
            count++;
        }

        int start = Math.max(0, count - 3);

        for (int i = start; i < count; i++) {
            System.out.print(arr[i]);
            if (i < count - 1) {
                System.out.print(" ");
            }
        }
    }
}
//형성평가5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] weight = new double[6];
        double sum = 0;

        for (int i = 0; i < 6; i++) {
            weight[i] = sc.nextDouble();
            sum += weight[i];
        }

        double avg = sum / 6;

        System.out.printf("%.1f%n", avg);
    }
}
//형성평가6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = {'J', 'U', 'N', 'G', 'O', 'L'};

        char input = sc.next().charAt(0);
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("none");
        }
    }
}
//형성평가7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            int num = sc.nextInt();
            if (num == 999) {
                break;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
//형성평가8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            if (num % 5 == 0) {
                count++;
                sum += num;
            }
        }

        double avg = (double) sum / count;

        System.out.println("Multiples of 5 : " + count);
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f%n", avg);
    }
}
//형성평가9
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            arr[count] = num;
            count++;
        }

        System.out.println(count);

        for (int i = 0; i < count; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print((arr[i] * 2) + " ");
            } else {
                System.out.print((arr[i] / 2) + " ");
            }
        }
    }
}