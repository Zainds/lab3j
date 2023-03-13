import java.util.Scanner;

public class Main {
    public static int square(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        System.out.println("Введите первую сторону пр-угольника");
        x = in.nextInt();
        System.out.println("Введите вторую сторону пр-угольника");
        y = in.nextInt();
        System.out.println("Площадь пр-угольника = " + square(x, y));
    }
}