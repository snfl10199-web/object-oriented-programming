// 파일입출력 - 형성평가1
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File inFile = new File("input.txt");
        Scanner sc = inFile.exists() ? new Scanner(inFile) : new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double sum = a + b;

        pw.printf("%.2f %.2f %.2f\n", a, b, sum);

        sc.close();
        pw.close();
    }
}

// 파일입출력 - 형성평가2
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File inFile = new File("input.txt");
        Scanner sc = inFile.exists() ? new Scanner(inFile) : new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        int avg = sum / 3;
        int rem = sum % 3;

        pw.println(sum + " " + avg + "..." + rem);

        sc.close();
        pw.close();
    }
}

// 파일입출력 - 형성평가3
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);

        int res = 0;
        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            case '%':
                res = a % b;
                break;
        }

        pw.println(a + " " + op + " " + b + " = " + res);

        sc.close();
        pw.close();
    }
}

// 파일입출력 - 형성평가4
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File inFile = new File("input.txt");
        Scanner sc = inFile.exists() ? new Scanner(inFile) : new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        int n = sc.nextInt();
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        pw.println(fact);

        sc.close();
        pw.close();
    }
}

// 파일입출력 - 형성평가5
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File inFile = new File("input.txt");
        Scanner sc = inFile.exists() ? new Scanner(inFile) : new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) break;
            if (n % 3 == 0 && n % 5 == 0) {
                list.add(n);
            }
        }

        if (list.isEmpty()) {
            pw.println(0);
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) pw.print(" ");
                pw.print(list.get(i));
            }
            pw.println();
            pw.println(list.size());
        }

        sc.close();
        pw.close();
    }
}

// 파일입출력 - 형성평가6
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File inFile = new File("input.txt");
        Scanner sc = inFile.exists() ? new Scanner(inFile) : new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i) * 2; j++) {
                pw.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                if (j > 0) pw.print(" ");
                pw.print("*");
            }
            pw.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < (n - i) * 2; j++) {
                pw.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                if (j > 0) pw.print(" ");
                pw.print("*");
            }
            pw.println();
        }

        sc.close();
        pw.close();
    }
}

// 파일입출력 - 형성평가7
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File inFile = new File("input.txt");
        Scanner sc = inFile.exists() ? new Scanner(inFile) : new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        int a = sc.nextInt();
        int b = sc.nextInt();

        int start = Math.min(a, b);
        int end = Math.max(a, b);
        int count = 0;

        for (int year = start; year <= end; year++) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                count++;
            }
        }

        pw.println(count);

        sc.close();
        pw.close();
    }
}

// 파일입출력 - 형성평가8
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File inFile = new File("input.txt");
        Scanner sc = inFile.exists() ? new Scanner(inFile) : new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        int n = sc.nextInt();
        Double[] avg = new Double[n];

        for (int i = 0; i < n; i++) {
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            avg[i] = (s1 + s2 + s3) / 3.0;
        }

        Arrays.sort(avg, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            pw.printf("%.1f\n", avg[i]);
        }

        sc.close();
        pw.close();
    }
}

// 파일입출력 - 형성평가9
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File inFile = new File("input.txt");
        Scanner sc = inFile.exists() ? new Scanner(inFile) : new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        String line = sc.nextLine();
        pw.println(line.length());

        String[] words = line.split(" ");
        int maxLen = 0;
        for (String w : words) {
            if (w.length() > maxLen) {
                maxLen = w.length();
            }
        }

        boolean first = true;
        for (String w : words) {
            if (w.length() == maxLen) {
                if (!first) pw.print(" ");
                pw.print(w);
                first = false;
            }
        }
        pw.println();

        sc.close();
        pw.close();
    }
}

// 파일입출력 - 형성평가10
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File inFile = new File("input.txt");
        Scanner sc = inFile.exists() ? new Scanner(inFile) : new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        String[] words = new String[10];
        for (int i = 0; i < 10; i++) {
            words[i] = sc.next();
        }
        String target = sc.next();

        List<String> result = new ArrayList<>();
        for (String w : words) {
            if (w.contains(target)) {
                result.add(w);
            }
        }

        Collections.sort(result);

        for (String w : result) {
            pw.println(w);
        }

        sc.close();
        pw.close();
    }
}