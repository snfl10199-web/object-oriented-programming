// 문자열1 - 형성평가1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        
        int sum = ch1 + ch2;
        int diff = Math.abs(ch1 - ch2);
        
        System.out.println(sum + " " + diff);
        
        sc.close();
    }
}

// 문자열1 - 형성평가2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        System.out.println(str.substring(0, 5));
        
        sc.close();
    }
}

// 문자열1 - 형성평가3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                if (Character.isUpperCase(ch)) {
                    ch = Character.toLowerCase(ch);
                }
                System.out.print(ch);
            }
        }
        
        sc.close();
    }
}

// 문자열1 - 형성평가4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char target = sc.next().charAt(0);
        
        int index = str.indexOf(target);
        
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}

// 문자열1 - 형성평가5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.next();
        String str2 = sc.next();
        
        int maxLen = Math.max(str1.length(), str2.length());
        System.out.println(maxLen);
        
        sc.close();
    }
}

// 문자열1 - 형성평가6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder(sc.next());
        
        while (sb.length() > 1) {
            int idx = sc.nextInt() - 1;
            
            if (idx >= sb.length()) {
                idx = sb.length() - 1;
            }
            
            sb.deleteCharAt(idx);
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}

// 문자열1 - 형성평가7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        String[] words = line.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + ". " + words[i]);
        }
        
        sc.close();
    }
}