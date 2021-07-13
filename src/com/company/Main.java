package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // 1 task
        Scanner in = new Scanner(System.in);
        int a, b = 0;
        double x, y = 0;
        a = in.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число четное");
        } else System.out.println("Число не четное");
        // 2 task

        if (a % 3 == 0) {
            System.out.println("Делится на три");
        }
        if (a % 5 == 0) {
            System.out.println("Делится на пять");
        }
        if (a % 7 == 0) {
            System.out.println("Делится на семь");
        }
        // 3 task
        System.out.println("Введите делимое: ");
        x = in.nextInt();
        System.out.println("Введите делитель: ");
        y = in.nextInt();
        if (y != 0) {
            System.out.println("Частное равно:" + x / y);
        } else System.out.println("Ошибка");
        // 4 task
        String Tyear = "1794";
        System.out.println("Введите год основания Одессы: ");
        String year = in.next();
        if (Tyear.hashCode() == year.hashCode()) {
            System.out.println("Правильно)");
        }
        else System.out.println("НЕ правильно(((");
        // 5 task
        System.out.println("Введите год: ");
        int goda = in.nextInt();
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println("Год высокостный ");
                }
            } else System.out.println("Год не высокостный ");
        } else System.out.println("Год не высокостный ");

    }
}

