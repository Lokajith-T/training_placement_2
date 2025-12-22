import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10, b = 5;
        System.out.println("1.Add 2.Sub 3.Mul 4.Div");
        int ch = sc.nextInt();
        switch (ch) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4: System.out.println(a / b); break;
        }
    }
}
