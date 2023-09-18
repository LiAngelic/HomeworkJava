package ru.mirea.lab1;
import java.util.Scanner;

public class Hw_1_ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int i = 0, sum1 = 0, sum2 = 0;
        while(i < array.length) {
            array[i] = sc.nextInt();
            sum1 = sum1 + array[i];
            i = i + 1;
        }
        int max = array[0], min = array[0];
        i = 0;
        do {
            sum2 = sum2 + array[i];
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
            i = i + 1;
        } while(i < array.length);
        System.out.print("sum1 = " + sum1 + "\nsum2 = " + sum2 + "\nmax = " + max + "\nmin = " + min);
    }
}
