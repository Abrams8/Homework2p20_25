package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 6;
        if (x % 2 == 0) {
            System.out.print(x);
            System.out.println(" четное");

        } else
            System.out.println(x + " нечетное");
//
        int n = 9;
        if (n == 1) {
            System.out.println("monday");
        } else if (n == 2) {
            System.out.println("Вторник");
        } else if (n == 3) {
            System.out.println("Среда");
        } else if (n == 4) {
            System.out.println("Четверг");
        } else if (n == 5) {
            System.out.println("Пятница");
        } else if (n == 6) {
            System.out.println("Суббота");
        } else if (n == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("вообще-то в неделе 7 дней!!)");
        }

    }
}
