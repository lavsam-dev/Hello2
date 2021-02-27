package ru.geekbrains.lesson1;

public class FirstApp {
    public static void main(String[] args) {
        char cVar = 'E';
        boolean boolVar = true;
        byte bVar = 64;
        int iVar = 32000;
        short sVar = 16000;
        long lVar = 2000000000L;
        float fVar = 3.62f;
        double dVar = 4.12;
        System.out.println(funcAf(1, 2, 3, 4));
        System.out.println(funcAi(1, 2, 3, 4));
    }

    private static float funcAf(int a, int b, int c, int d) {
        float f = a * (b + ((float)c / d));
        return(f);
    }

    private static float funcAi(int a, int b, int c, int d) {
        float f = a * (b + (c / d));
        return(f);
    }
}
