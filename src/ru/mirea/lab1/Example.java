package ru.mirea.lab1;
import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            sum = sum + array[i];
        }
        System.out.print("sum = " + sum + "\naverage = " + sum/size);
    }
}
