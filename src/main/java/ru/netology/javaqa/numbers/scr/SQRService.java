package ru.netology.javaqa.numbers.scr;

public class SQRService {
    public static int sqrNum(int a, int b) {

        int sum = 0;
        int i;
        for (i = 10; i < 99; i = i + 1) {
            int power = (int) Math.pow(i, 2.0);
            if (power > a && power < b) {
                sum = sum + 1;
            }
        }
        return sum;
    }
}