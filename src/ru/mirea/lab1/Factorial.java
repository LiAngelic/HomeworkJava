package ru.mirea.lab1;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Посчитать факториал числа ");
        int n = sc.nextInt();
        System.out.print(n + "! = " + factorial(n));
    }
    public static int  factorial(int n) {
        int fac = 1;
        for (int i = 2; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }
}
