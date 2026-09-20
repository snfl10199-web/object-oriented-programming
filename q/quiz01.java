// 출력 - 형성평가
// 101 출력
public class Main {
    public static void main(String[] args) {
        System.out.println("My name is Hong");
    }
}

// 102 출력
public class Main {
    public static void main(String[] args) {
        System.out.println("My hometown");
        System.out.println("Flowering mountain");
    }
}

// 103 출력
public class Main {
    public static void main(String[] args) {
        System.out.println("TTTTTTTTTT");
        System.out.println("TTTTTTTTTT");
        System.out.println("    TT");
        System.out.println("    TT");
        System.out.println("    TT");
    }
}

// 104 출력
public class Main {
    public static void main(String[] args) {
        System.out.println("kor 90");
        System.out.println("mat 80");
        System.out.println("eng 100");
        System.out.println("sum " + (90 + 80 + 100));
    }
}

// 105 출력
public class Main {
    public static void main(String[] args) {
        System.out.printf("%15s%15s%15s\n", "Seoul", "10,312,545", "+91,375");
        System.out.printf("%15s%15s%15s\n", "Pusan", "3,567,910", "+5,868");
        System.out.printf("%15s%15s%15s\n", "Incheon", "2,758,296", "+64,888");
        System.out.printf("%15s%15s%15s\n", "Daegu", "2,511,676", "+17,230");
        System.out.printf("%15s%15s%15s\n", "Gwangju", "1,454,636", "+29,774");
    }
}

// 입력 - 형성평가
// 106 입력
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        
        System.out.println(a + " + " + b + " = " + c);
    }
}

// 107 입력
public class Main {
    public static void main(String[] args) {
        double a = 80.5;
        double b = 22.34;
        
        System.out.printf("%10.2f%10.2f%10.2f\n", a, b, a + b);
    }
}

// 108 입력
public class Main {
    public static void main(String[] args) {
        int a = 50;
        double b = 100.12;
        
        System.out.printf("%.2f * %d = %.0f\n", b, a, a * b);
    }
}

// 109 입력
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("sum = " + (a + b + c));
        
        sc.close();
    }
}

// 110 입력
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("yard? ");
        double yard = sc.nextDouble();
        double cm = yard * 91.44;
        
        System.out.printf("%.1fyard = %.1fcm\n", yard, cm);
        
        sc.close();
    }
}
