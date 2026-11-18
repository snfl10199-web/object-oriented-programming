// 구조체 - 형성평가1
import java.util.Scanner;

class Person {
    String name;
    String tel;
    String addr;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Person p = new Person();
        p.name = sc.next();
        p.tel = sc.next();
        p.addr = sc.next();
        
        System.out.println("name : " + p.name);
        System.out.println("tel : " + p.tel);
        System.out.println("addr : " + p.addr);
        
        sc.close();
    }
}

// 구조체 - 형성평가2
import java.util.Scanner;

class Person {
    String name;
    String tel;
    String addr;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Person[] people = new Person[3];
        for (int i = 0; i < 3; i++) {
            people[i] = new Person();
            people[i].name = sc.next();
            people[i].tel = sc.next();
            people[i].addr = sc.next();
        }
        
        Person first = people[0];
        for (int i = 1; i < 3; i++) {
            if (people[i].name.compareTo(first.name) < 0) {
                first = people[i];
            }
        }
        
        System.out.println("name : " + first.name);
        System.out.println("tel : " + first.tel);
        System.out.println("addr : " + first.addr);
        
        sc.close();
    }
}

// 구조체 - 형성평가3
import java.util.Scanner;

class Rect {
    int x, y, x2, y2;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Rect r1 = new Rect();
        r1.x = sc.nextInt();
        r1.y = sc.nextInt();
        r1.x2 = sc.nextInt();
        r1.y2 = sc.nextInt();
        
        Rect r2 = new Rect();
        r2.x = sc.nextInt();
        r2.y = sc.nextInt();
        r2.x2 = sc.nextInt();
        r2.y2 = sc.nextInt();
        
        Rect res = new Rect();
        res.x = Math.min(r1.x, r2.x);
        res.y = Math.min(r1.y, r2.y);
        res.x2 = Math.max(r1.x2, r2.x2);
        res.y2 = Math.max(r1.y2, r2.y2);
        
        System.out.println(res.x + " " + res.y + " " + res.x2 + " " + res.y2);
        
        sc.close();
    }
}

// 구조체 - 형성평가4
import java.util.Scanner;

class Body {
    int height;
    double weight;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Body father = new Body();
        father.height = sc.nextInt();
        father.weight = sc.nextDouble();
        
        Body mother = new Body();
        mother.height = sc.nextInt();
        mother.weight = sc.nextDouble();
        
        Body student = new Body();
        student.height = (father.height + mother.height) / 2 + 5;
        student.weight = (father.weight + mother.weight) / 2.0 - 4.5;
        
        System.out.println("height : " + student.height + "cm");
        System.out.printf("weight : %.1fkg\n", student.weight);
        
        sc.close();
    }
}

// 구조체 - 형성평가5
import java.util.Arrays;
import java.util.Scanner;

class Student {
    String name;
    int s1, s2, s3;
    int sum;

    Student(String name, int s1, int s2, int s3) {
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.sum = s1 + s2 + s3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            students[i] = new Student(name, s1, s2, s3);
        }

        Arrays.sort(students, (a, b) -> b.sum - a.sum);

        for (Student s : students) {
            System.out.println(s.name + " " + s.s1 + " " + s.s2 + " " + s.s3 + " " + s.sum);
        }

        sc.close();
    }
}