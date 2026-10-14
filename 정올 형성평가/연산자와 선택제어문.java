// 연산자 형성평가 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int comp = sc.nextInt();
        
        int sum = kor + eng + math + comp;
        int avg = sum / 4;
        
        System.out.println("sum " + sum);
        System.out.println("avg " + avg);
        
        sc.close();
    }
}

// 연산자 형성평가 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(a + " / " + b + " = " + (a / b) + "..." + (a % b));
        
        sc.close();
    }
}

// 연산자 형성평가 3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int width = sc.nextInt();
        int length = sc.nextInt();
        
        width += 5;
        length *= 2;
        
        System.out.println("width = " + width);
        System.out.println("length = " + length);
        System.out.println("area = " + (width * length));
        
        sc.close();
    }
}

// 연산자 형성평가 4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println((++a) + " " + (b--));
        System.out.println(a + " " + b);
        
        sc.close();
    }
}

// 연산자 형성평가 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mHeight = sc.nextInt();
        int mWeight = sc.nextInt();
        
        int kHeight = sc.nextInt();
        int kWeight = sc.nextInt();
        
        boolean result = (mHeight > kHeight) && (mWeight > kWeight);
        
        System.out.println(result);
        
        sc.close();
    }
}

// 선택제어문 형성평가 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a > b) {
            System.out.println(a - b);
        } else {
            System.out.println(b - a);
        }
        
        sc.close();
    }
}

// 선택제어문 형성평가 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if (n == 0) {
            System.out.println("zero");
        } else if (n > 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }
        
        sc.close();
    }
}

// 선택제어문 형성평가 3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("common year");
        }
        
        sc.close();
    }
}

// 선택제어문 형성평가 4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number? ");
        int num = sc.nextInt();
        
        if (num == 1) {
            System.out.println("dog");
        } else if (num == 2) {
            System.out.println("cat");
        } else if (num == 3) {
            System.out.println("chick");
        } else {
            System.out.println("I don't know.");
        }
        
        sc.close();
    }
}

// 선택제어문 형성평가 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int month = sc.nextInt();
        
        switch (month) {
            case 2:
                System.out.println(28);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            default:
                System.out.println(31);
                break;
        }
        
        sc.close();
    }
}