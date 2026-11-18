// 문자열2 - 형성평가1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        String[] words = line.split(" ");
        
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
        
        sc.close();
    }
}

// 문자열2- 형성평가2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] words = {"flower", "rose", "lily", "daffodil", "azalea"};
        char target = sc.next().charAt(0);
        
        int count = 0;
        
        for (String word : words) {
            boolean found = false;
            if (word.length() > 1 && word.charAt(1) == target) {
                found = true;
            }
            if (word.length() > 2 && word.charAt(2) == target) {
                found = true;
            }
            
            if (found) {
                System.out.println(word);
                count++;
            }
        }
        
        System.out.println(count);
        
        sc.close();
    }
}

// 문자열2 - 형성평가3
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while (true) {
            String word = sc.next();
            if (word.equals("0")) {
                break;
            }
            list.add(word);
        }
        
        System.out.println(list.size());
        
        for (int i = 0; i < list.size(); i += 2) {
            System.out.println(list.get(i));
        }
        
        sc.close();
    }
}

// 문자열2 - 형성평가4
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] words = new String[n];
        
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        
        Arrays.sort(words);
        
        for (String word : words) {
            System.out.println(word);
        }
        
        sc.close();
    }
}

// 문자열2 - 형성평가5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = sc.next();
        }
        
        String target1 = sc.next();
        String target2 = sc.next();
        
        boolean found = false;
        
        for (String word : words) {
            if (word.contains(target1) || word.contains(target2)) {
                System.out.println(word);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("none");
        }
        
        sc.close();
    }
}

//  문자열2 - 형성평가6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        int n = sc.nextInt();
        
        a = a + b;
        
        if (n < b.length()) {
            b = a.substring(0, n) + b.substring(n);
        } else {
            b = a.substring(0, n);
        }
        
        System.out.println(a);
        System.out.println(b);
        
        sc.close();
    }
}

// 문자열2 - 형성평가7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        long num1 = parsePrefixInt(s1);
        long num2 = parsePrefixInt(s2);
        
        System.out.println(num1 * num2);
        
        sc.close();
    }
    
    private static long parsePrefixInt(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        if (idx < s.length() && (s.charAt(idx) == '+' || s.charAt(idx) == '-')) {
            sb.append(s.charAt(idx));
            idx++;
        }
        
        boolean hasDigit = false;
        while (idx < s.length() && Character.isDigit(s.charAt(idx))) {
            sb.append(s.charAt(idx));
            idx++;
            hasDigit = true;
        }
        
        if (!hasDigit) {
            return 0;
        }
        
        return Long.parseLong(sb.toString());
    }
}

// 문자열2 - 형성평가8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String word = sc.next();
            if (word.equals("END")) {
                break;
            }
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.println(reversed);
        }
        
        sc.close();
    }
}

//  문자열2 - 형성평가9
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        double d = sc.nextDouble();
        String str = sc.next();
        
        String combined = String.format("%d%.3f%s", num, d, str);
        int mid = (combined.length() + 1) / 2;
        
        System.out.println(combined.substring(0, mid));
        System.out.println(combined.substring(mid));
        
        sc.close();
    }
}