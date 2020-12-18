package com.javacourse.se.lesson6;

public class Numbers {

    // x+3=5

    static byte a = 120; //2^8 = 256 (от -128 до 127)
    static short b = 657; //2^16 = 65.538 (от -32768 до32767)
    static int c = 34_567; //2^32 = 4.294.967.296 (от 2147483648 до 214748647)
    static long d = 33232335989394L; //2^64 = 18.446.744.073.709.551.616 (от -922332036854775808 до

    static char e = 'C';

    static float f = 123456789101112f;
    static double g = 7.4;
    static boolean h = true;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }


}
